package reflect.simple;

public class Record {
	@Field_Method_Parameter_Annotation(describe = "编号", type = int.class)
	int id;
	@Field_Method_Parameter_Annotation(describe = "姓名", type = String.class)
	String name;

	@Constructor_Annotation
	public Record(){
		
	}
	
	@Constructor_Annotation(value = "非默认")
	public Record(@Field_Method_Parameter_Annotation(describe = "编号", type = int.class) int id, 
			@Field_Method_Parameter_Annotation(describe = "姓名", type = String.class) String name){
		this.id = id;
		this.name = name;
	}
	
	@Field_Method_Parameter_Annotation(describe = "获取编号", type = int.class)
	public int getId(){
		return id;
	}
	
	@Field_Method_Parameter_Annotation(describe = "设置编号", type = int.class)
	public void setId(@Field_Method_Parameter_Annotation(describe = "编号", type = int.class) int id){
		this.id = id;
	}
	
	@Field_Method_Parameter_Annotation(describe = "获取姓名", type = String.class)
	public String getName(){
		return name;
	}
	
	@Field_Method_Parameter_Annotation(describe = "获取编号", type = String.class)
	public void setName(@Field_Method_Parameter_Annotation(describe = "获取编号", type = String.class) String name){
		this.name = name;
	}
}
