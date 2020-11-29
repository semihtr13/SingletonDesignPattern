public class ExitDialog {
    private static ExitDialog exitDialog = null;

    private ExitDialog() {

    }

    public static ExitDialog getInstance() {
        if (exitDialog == null) {
            //double checked locking
            synchronized (ExitDialog.class) {
                if (exitDialog == null) {
                    exitDialog = new ExitDialog();
                    System.out.println("Object was created!");
                }
            }
        } else {
            System.out.println("Object already was created!");
        }
        return exitDialog;
    }


}

