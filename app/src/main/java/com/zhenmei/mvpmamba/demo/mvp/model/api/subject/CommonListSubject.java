package com.zhenmei.mvpmamba.demo.mvp.model.api.subject;

import java.util.ArrayList;
import java.util.List;

public class CommonListSubject<T> {
    public int total;
    public int resultSize;
    public Integer type;


    public List<T> rows = new ArrayList<>();
}
