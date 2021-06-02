public class Climber {
    private int max_height;
    private int difference3_step;
    private int length;

    public int getMax_height() {
        return max_height;
    }
    public void setMax_height(int max_height) {
        this.max_height = max_height;
    }
    public int getDifference3_step() {
        return difference3_step;
    }
    public void setDifference3_step(int difference3_step) {
        // Если максимальный перепад 3 ближайших вершин > max, то ограничить максимальной вершиной
        if (difference3_step < max_height) {
            this.difference3_step = difference3_step;
        }
        else {
            this.difference3_step = max_height;
        }
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        if (length > 3) {
            this.length = length;
        } else {
            System.out.println("Путь не может быть < 3 вершин!");
        }
    }
    public void printRoute () {
        int[] route = new int[length];
        int[] temp = new int[3];
        int max;
        int min;
        int difference = 0; // Разница между соседними вершинами
        System.out.println(difference3_step); // Генерация двух первых вершин
        route[0] = difference3_step / 2 + (int) (Math.random()*difference3_step / 2);
        route[1] = (int) (Math.random()*difference3_step);
        if (route[0] > route[1]) {
            max = route[0];
            min = route[1];
        }
        else {
            max = route[1];
            min = route[0];
        }
        System.out.print(route[0] + " ");
        System.out.print(route[1] + " ");
        difference = Math.abs(max-min);
}