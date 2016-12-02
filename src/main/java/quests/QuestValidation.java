package quests;
/* APONTAMENTOS */
import quests.QuestMain;

public class QuestValidation {
    boolean valid;
    
    public QuestValidation(){
        if (valid == true){
            QuestMain.questCount++;
            //takeQuest;
            valid = false;
        }
        else{
            System.out.println("This quest was already taken");
        }
    }
}
