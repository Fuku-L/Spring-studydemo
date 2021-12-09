package com.wisely.domain;

public class DemoObj {
    private Long id;
    private String name;

    /**
        jackson 对对象和 json 做转换时，需要此空构造
     */
    public DemoObj(){
        super();
    }

    public DemoObj(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
