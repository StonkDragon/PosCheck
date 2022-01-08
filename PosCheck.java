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
        userInput = System.console().readLine().replaceAll("[^0-9, -]", "");
        userInput = userInput.trim();
        data = userInput.split(",| ");
        int[] dataints = new int[data.length];
        int index = 0;
        for (String str : data) {
            if (str.startsWith("-")) {
                dataints[index] = Integer.parseInt(str) - 1;
            } else {
                dataints[index] = Integer.parseInt(str);
            }
            index++;
        }
        index = 0;
        int[] dataout = new int[dataints.length];
        for (int coord : dataints) {
            System.out.println("Coordinate: " + coord);
            dataout[index] = coord;
            index++;
        }

        for (int i = 0; i < 3; i++) {
            pos[i] = Math.min(dataout[i], dataout[i+3]);
        }
        for (int i = 3; i < 6; i++) {
            pos[i] = Math.max(dataout[i-3], dataout[i]);
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
