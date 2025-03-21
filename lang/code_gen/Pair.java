package lang.code_gen;

public class Pair<A,B> {

    private A first;
    private B second;

    public Pair(A first, B second) {
	this.first = first;
	this.second = second;
    }

    public A first() { return first; }
    public B second() { return second; }

    public String toString() {
	return "(" + first.toString() + ", " + second.toString() + ")";
    }

}
