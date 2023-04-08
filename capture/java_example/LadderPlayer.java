package java_example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;

public class LadderPlayer {
    //Code without bumpers
    static ArrayList<Eight.Puck> plistLadder = new ArrayList<Eight.Puck>();
    static ArrayList<Eight.Bumper> blistLadder = new ArrayList<Eight.Bumper>();
    static ArrayList<Eight.Sled> slistLadder = new ArrayList<Eight.Sled>();
    public static void w_plist(ArrayList <Eight.Puck> wer){
        Collections.copy(plistLadder,wer);
    }
    public static void w_blist(ArrayList <Eight.Bumper> wer){
        Collections.copy(blistLadder,wer);
    }
    public static void w_slist(ArrayList <Eight.Sled> wer){
        Collections.copy(slistLadder,wer);
    }
    public static void cout(){
        System.out.println("HELLO");
        for(Eight.Puck to: plistLadder){
            System.out.println(to.toString() + "\n");
        }
    }
}
