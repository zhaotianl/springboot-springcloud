package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@NoArgsConstructor
@SuppressWarnings("serial")
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long  deptno;   //涓婚敭
    private String  dname;   //閮ㄩ棬鍚嶇О
    private String  db_source;//鏉ヨ嚜閭ｄ釜鏁版嵁搴擄紝鍥犱负寰湇鍔℃灦鏋勫彲浠ヤ竴涓湇鍔″搴斾竴涓暟鎹簱锛屽悓涓�涓俊鎭瀛樺偍鍒颁笉鍚屾暟鎹簱

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }
   ///  本地仓库的代码
    //远程仓库的diamagnetic
    // 本地仓库的第二次改变
    //测试0001
   ///  远程仓库测试git 库
    // 顶顶顶顶顶顶顶
    //12454545
    11///456456456yaucheng
54564545454554
123223232321