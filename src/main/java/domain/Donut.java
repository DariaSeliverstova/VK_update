package domain;

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private boolean canBublishFreeCopy;
    private String editMade;

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public void setCanBublishFreeCopy(boolean canBublishFreeCopy) {
        this.canBublishFreeCopy = canBublishFreeCopy;
    }

    public void setEditMade(String editMade) {
        this.editMade = editMade;
    }

    public boolean isDonut() {
        return isDonut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public boolean isCanBublishFreeCopy() {
        return canBublishFreeCopy;
    }

    public String getEditMade() {
        return editMade;
    }
}
