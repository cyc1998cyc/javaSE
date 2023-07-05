package com.chen;

public enum SeasonEnum {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;

    private String description;

    SeasonEnum() {
        System.out.println("枚举的实力初始化了");
    }

    SeasonEnum(String description){


    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        SeasonEnum spring = SeasonEnum.SPRING;
        System.out.println(spring);
    }


}
