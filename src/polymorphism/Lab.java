package polymorphism;

import java.util.ArrayList;

public class Lab {
    public static void main(String[] args) {

        // concept: 1 person = different behaviour; Split personality.

        Human peter = new SpiderMan();

        peter.talk();
        // peter.makeWeb(); // now Peter HUMAN so he can't make web in this instance.

        SpiderMan peter1 = new SpiderMan();

        peter1.talk();
        peter1.makesWeb(); // now Peter SPIDERMAN and he can talk and make spiderweb


        Spider peter2 = new SpiderMan();

        // peter2.talk();
        peter2.makesWeb(); // now Peter is SPIDER and in this instance he can't talk



        Human bruce = new Batman();
        Batman bruce1 = new Batman();
        Bat bruce2 = new Batman();

        ArrayList<Human> humanInstances = new ArrayList<>();

        humanInstances.add(peter);
        humanInstances.add(peter1);
        // HumanInstances.add(peter2); // can not because Spider is not a Human.
        humanInstances.add(bruce);
        humanInstances.add(bruce1);
        // HumanInstances.add(bruce2); // can not because Bat is not a Human.

        System.out.println(humanInstances);

        Human alena = new HumanAlena();
        System.out.println(alena);

        humanInstances.add(alena);

        System.out.println("============================================");
        System.out.println();

        // I am Developer Detective who can send objects on DNA tests. How many SpiderMan instances are hidden behind these faces?
        /*
        Faces are stored: in ArrayList<Human> humanInstances:
       indx0 peter
       indx1 peter1
       indx2 bruce
       indx3 bruce1
       indx4 alena
        See the picture for clarification


         */



       int countSpiderMans = 0;
        for (Human eachInstance : humanInstances){
            if(eachInstance instanceof SpiderMan){
                countSpiderMans++;
                System.out.println(eachInstance);
            }
        }

        System.out.println("SpiderMen faces found: " + countSpiderMans);




    }
}
