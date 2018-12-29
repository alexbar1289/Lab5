public class First extends Thread{
    public void run() {

        Form.consoleOutput("Поток " + this.getName());
    }
}
