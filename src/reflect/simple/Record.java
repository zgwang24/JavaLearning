package reflect.simple;

public class Record {
	@Field_Method_Parameter_Annotation(describe = "���", type = int.class)
	int id;
	@Field_Method_Parameter_Annotation(describe = "����", type = String.class)
	String name;

	@Constructor_Annotation
	public Record(){
		
	}
	
	@Constructor_Annotation(value = "��Ĭ��")
	public Record(@Field_Method_Parameter_Annotation(describe = "���", type = int.class) int id, 
			@Field_Method_Parameter_Annotation(describe = "����", type = String.class) String name){
		this.id = id;
		this.name = name;
	}
	
	@Field_Method_Parameter_Annotation(describe = "��ȡ���", type = int.class)
	public int getId(){
		return id;
	}
	
	@Field_Method_Parameter_Annotation(describe = "���ñ��", type = int.class)
	public void setId(@Field_Method_Parameter_Annotation(describe = "���", type = int.class) int id){
		this.id = id;
	}
	
	@Field_Method_Parameter_Annotation(describe = "��ȡ����", type = String.class)
	public String getName(){
		return name;
	}
	
	@Field_Method_Parameter_Annotation(describe = "��ȡ���", type = String.class)
	public void setName(@Field_Method_Parameter_Annotation(describe = "��ȡ���", type = String.class) String name){
		this.name = name;
	}
}
