package literals; 
class FloatLiteral{
    public static void main(String...args){
	float float1 = 0.45F;
	float float2 = 0.45f;	
	float float3 = 2147483647F;
	float float3_1 = 214748364F;
	float float3_2 = 21474836F;
	float float4 = 2.14748365E9F;
	
	System.out.println("0.45F=" + float1) ;
	System.out.println("0.45f=" + float2) ;
	System.out.println("2147483647F=" + float3) ;
	System.out.println("214748364F=" + float3_1) ;
	System.out.println("21474836F=" + float3_2) ;
	System.out.println("2.14748365E9F=" + float4) ;
	System.out.println("Float.MAX_VALUE=" + Float.MAX_VALUE) ;
	System.out.println("Float.MIN_VALUE=" + Float.MIN_VALUE) ;
	System.out.println("Float.MAX_VALUE cast to long=" + (long)Float.MAX_VALUE) ;
	

    }
}
