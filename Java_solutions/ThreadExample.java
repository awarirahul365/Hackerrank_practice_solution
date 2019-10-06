package question10;

import java.util.Vector;
import java.util.Random;

class count extends Thread{
    Vector vec;
    int k, i;
    public int count = 0;

    public count(int k, Vector vec){
        this.k = k;
        this.vec = vec;
    }

    public void run(){
        for(i = 0; i < vec.capacity(); i++){
            if(vec.elementAt(i).equals(k))              // check if elements match
                count++;

        }
    }
}

class Vote extends Thread{
    Random rand = new Random();                      // generating a random number
    int max = 750;                                   // max wait time for thread
    int min = 100;                                   // min wait time for thread
    int v, s;
    Vector vec;

    public Vote(int v, Vector vec)
    {
        this.v = v;
        this.vec = vec;
    }

    public void run() {
        try
        {
            // while voting print id
            while(vec.size() < 240) {               // ensure size of vote vector is below 240
                System.out.println(this.getName() + " is Voting");
                vec.add(v);

                s = rand.nextInt((max - min) + 1) + min;
                System.out.println(this.getName() + " is sleeping for " + s+"ms");
                Thread.sleep(s);                    // create random delay between threads
            }

        }
        catch(InterruptedException e)
        {
            System.out.println("Voting Exception: " + e);
        }
    }

}

public class ThreadExample {
    public static void main(String[] args) {
        Vector votevec = new Vector(240);   // creating a vote array for 240 votes

        Vote a = new Vote(1, votevec);
        a.start();

        Vote b = new Vote(2, votevec);
        b.start();

        Vote c = new Vote(3, votevec);
        c.start();

        try{
            a.join();
            b.join();
            c.join();
            System.out.println("Voting has ended!");
        }catch(Exception e){System.out.println(e);}

        count ac = new count(1, votevec);
        count bc = new count(2, votevec);
        count cc = new count(3, votevec);

        ac.start();
        bc.start();
        cc.start();

        try{
            ac.join();
            bc.join();
            cc.join();
            System.out.println("Counting has ended!");
        }catch(Exception e){System.out.println(e);}

        int av = ac.count;
        int bv = bc.count;
        int cv = cc.count;

        System.out.println("elections.Vote Vector:" + "\n" + votevec);
        System.out.println(av + " votes for A");
        System.out.println(bv + " votes for B");
        System.out.println(cv + " votes for C");

        if(av >= bv && av >= cv){
            if(av == bv || av == cv)
                System.out.println("Tie in elections!");
            else
                System.out.println("A has won the elections!");
        }
        else if(bv >= av && bv >= cv){
            if(av == bv || bv == cv)
                System.out.println("Tie in elections!");
            else
                System.out.println("B has won the elections!");
        }
        else if(cv >= av && cv >= bv){
            if(cv == bv || cv == av)
                System.out.println("Tie in elections!");
            else
                System.out.println("C has won the elections!");
        }
    }
}