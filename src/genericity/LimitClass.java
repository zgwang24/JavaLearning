package genericity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LimitClass<T extends List> {
	LimitClass<ArrayList> l1 = new LimitClass<ArrayList>();
	LimitClass<LinkedList> l2 = new LimitClass<LinkedList>();
	LimitClass<List> l3 = new LimitClass<List>();
}
