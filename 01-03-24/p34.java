class Box {
    int width;
    int height;
    int depth;

    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void display() {
        System.out.println("Width: " + width + " Height: " + height + " Depth: " + depth);
    }

    public static void main(String args[]) {
        Box b1 = new Box(10, 20, 30);

        Box b2 = b1;

        System.out.println("Box 1:");
        b1.display();

        System.out.println("Box 2:");
        b2.display();
    }
}