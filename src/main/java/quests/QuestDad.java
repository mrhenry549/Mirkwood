package quests;

/* 
   n = number
   g = give
*/

public class QuestDad {
    String dialog;
    int nMob, nItems, gGold, gItem, questNumb;

    public QuestDad(String dialog, int nMob, int nItems, int gGold, int gItem, int questNumb) {
        this.dialog = dialog;
        this.nMob = nMob;
        this.nItems = nItems;
        this.gGold = gGold;
        this.gItem = gItem;
        this.questNumb = questNumb;
    }

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }

    public int getnMob() {
        return nMob;
    }

    public void setnMob(int nMob) {
        this.nMob = nMob;
    }

    public int getnItems() {
        return nItems;
    }

    public void setnItems(int nItems) {
        this.nItems = nItems;
    }

    public int getgGold() {
        return gGold;
    }

    public void setgGold(int gGold) {
        this.gGold = gGold;
    }

    public int getgItem() {
        return gItem;
    }

    public void setgItem(int gItem) {
        this.gItem = gItem;
    }

    public int getQuestNumb() {
        return questNumb;
    }

    public void setQuestNumb(int questNumb) {
        this.questNumb = questNumb;
    }
    
}
