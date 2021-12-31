class PosCheck {
    static int[] pos = new int[6];
    static String userInput;
    static String[] data;
    static int x;
    static int y;
    static int z;
    static int dx;
    static int dy;
    static int dz;
    public static void main(String[] args) {
        System.out.print("Put in the coordinates of the corners: ");
        userInput = System.console().readLine().replaceAll("[^0-9, ]", "");
        data = userInput.split(",| ");
        for (int i = 0; i < 3; i++) {
            pos[i] = Math.min(Integer.parseInt(data[i]), Integer.parseInt(data[i+3]));
        }
        for (int i = 3; i < 6; i++) {
            pos[i] = Math.max(Integer.parseInt(data[i-3]), Integer.parseInt(data[i]));
        }
        x = pos[0];
        y = pos[1];
        z = pos[2];
        dx = pos[3] - x;
        dy = pos[4] - y;
        dz = pos[5] - z;
        System.out.println("Put this as the selector arguments: [x=" + x + ",y=" + y + ",z=" + z + ",dx=" + dx + ",dy=" + dy + ",dz=" + dz + "]");
    }
}
