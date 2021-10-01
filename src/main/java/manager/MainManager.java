package manager;



public class MainManager {

    private BlockManager[] managers;

    public BlockManager[] getManagers() {
        return managers;
    }

    public void setManagers(BlockManager[] managers) {
        this.managers = managers;
    }

    public String generatePage() {
        for (BlockManager manager: managers) {
            String block = manager.generateBlock();

        }
        return null;

    }
}
