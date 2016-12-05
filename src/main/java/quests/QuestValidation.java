package quests;
/* APONTAMENTOS */
import quests.QuestMain;

public class QuestValidation {
    boolean valid;
    boolean monsterKill;
    
    public QuestValidation(){
        if (monsterKill == true){
            QuestMain.questCount++;
        }
        else{
            System.out.println("This quest was already taken");
        }
    }
}
