// Course      : CMP-129
// Title       : abstract class Shape
// Instructor  : JReynolds

import java.util.Random;

public abstract class Shape {

    protected long id_;

    public Shape() {
	id_=0;
    }

    public Shape( long id ) {
	id_=id;
    }

    public Shape( Shape s ) {
	id_=s.id_;
    }

    public abstract double area();
    public abstract double perimeter();

}
