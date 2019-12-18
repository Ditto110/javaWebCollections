package com.fengmang.cleanlogs.cleanadjiangsulogs.java;

/**
 * @author ASUS
 * Created at 23:36.2019/12/18
 * 通过枚举来对数据进行描述
 */
public enum EnumApplication1 {

    SUCCESS("000000", "success", "操作成功"),
    ERROR("100000", "error", "操作失败");

    private String code;
    private String englishDesc;
    private String chinseDesc;

    EnumApplication1(String code, String englishDesc, String chinseDesc) {
        this.code = code;
        this.englishDesc = englishDesc;
        this.chinseDesc = chinseDesc;
    }

    private String getCode() {
        return code;
    }

    private String getEnglishDesc() {
        return englishDesc;
    }

    private String getChinseDesc() {
        return chinseDesc;
    }

    public static String StringToJson(final Object type) {
        if (null == type || type.equals("")){
            return "{'code':'-100000','englishDesc':'type is null','chineseDesc':'类型为空'}";}

        for (EnumApplication1 re : EnumApplication1.values()) {
            String name = re.name();
            if (name.equals(type.toString())) {
                return "{'code':'" + re.getCode()
                        + "','chineseDesc':'" + re.getChinseDesc()
                        + "','englishDesc':'" + re.getEnglishDesc()
                        + "'}";
            }
        }
        return "{'code':'-200000','englishDesc':'parameter is error ','chineseDesc':'参数类型错误'}";
    }


    public static void main(String[] args) {
        System.out.println(EnumApplication1.StringToJson(EnumApplication1.SUCCESS));
    }
}
