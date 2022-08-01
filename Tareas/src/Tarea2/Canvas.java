package Tarea2;

public class Canvas {
    private int width, height;
    private StringBuilder canva;
    private StringBuilder canva2;
    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        canva = new StringBuilder();
        canva.append("-"+"-".repeat(Math.max(0, width))).append("-");
        for (int i = 0; i < height; i++){
            canva.append("\n|");
            canva.append(" ".repeat(Math.max(0, width)));
            canva.append("|");
        }
        canva.append("\n" + "-" + "-".repeat(Math.max(0, width))).append("-");
    }

    public Canvas draw(int x1, int y1, int x2, int y2) {
        canva2 = new StringBuilder();
        canva2.append("-".repeat(Math.max(0, width))).append("--");

        for (int i = 0; i < height; i++){
            canva2.append("\n|");
            canva2.append(" ".repeat(Math.max(0, x1)));

            if (i < y1 || i > height - y1 - 1) canva2.append(" ".repeat(Math.max(0, x2 )));
            else if (i > y1 && i < y1 + y2 - 1) {
                canva2.append("x").append(" ".repeat(Math.max(0, x2) - 2)).append("x");
            }
            else if (i < y1 + y2) canva2.append("x".repeat(Math.max(0, x2)));
            else canva2.append(" ".repeat(Math.max(0, x2 )));

            canva2.append(" ".repeat(Math.max(0, x1)));
            canva2.append("|");
        }
        canva2.append("\n").append("-".repeat(Math.max(0, width))).append("--");
        return this;
    }

    public Canvas fill(int x, int y, char ch) {
        return this;
    }

    public String drawCanvas() {
        return canva2.toString();
    }
}
