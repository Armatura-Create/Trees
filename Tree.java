public class Tree {
    static int count;
    private int age;
    private float height;

    static {
        count = 0;
    }

    public Tree() {
        this(0, 0);
    }

    public Tree(int age) {
        this(age, 0);
    }

    public Tree(float height) {
        this(0, height);
    }


    public Tree(int age, float height) {
        count++;
        this.age = age;
        this.height = height;
    }

    public Tree(Tree name) {
        this(name.getAge(), name.getHeight());
    }

    @Override
    public String toString() {
        return "age = " + age
        + "\theight = " + height
        + "\tcount = " + count;
    }

    public int getCount() {
        return count;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
