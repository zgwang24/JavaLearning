import java.util.*;
public class Abc {
/** ������������������ʵ����ĿҪ��Ĺ��� **/
/** ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨�� ^-^  **/
    static int cut(int[] parts) {
    	int sum = 0;
    	for(int i = 0; i < parts.length; i++){
    		sum += parts[i];
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i = 0; i < parts.length; i++){
    		list.add(parts[i]);
    	}
    	for(int i = 0; i < list.size() && list.size() > 1; i++){
    		Collections.sort(list);
    		int val = list.get(0) + list.get(1);
    		sum += val;
    		list.remove(0);
    		list.remove(0);
    		list.add(val);
    	}    	
    	return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int pieces = Integer.parseInt(in.nextLine().trim());
        int[] parts = new int[pieces];
        for (int i = 0; i < pieces; i++) {
            parts[i] = Integer.parseInt(in.nextLine().trim());
        }
        System.out.println(cut(parts));
    }
}