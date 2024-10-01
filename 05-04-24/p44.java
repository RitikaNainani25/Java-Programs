class DefaultArgument{
    static void printMessage(String message) {
        System.out.println(message);
    }
    
    static void printMessage() {
        printMessage("Default Message");
    }
    
    public static void main(String[] args) {
        printMessage("Hello, world!");
        printMessage(); 
    }
}