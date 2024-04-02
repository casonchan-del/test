package com.example.demo.model;

import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_erupt.Power;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.ViewType;
import xyz.erupt.annotation.sub_field.sub_edit.ChoiceType;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.annotation.sub_field.sub_edit.VL;
import xyz.erupt.jpa.model.BaseModel;
import javax.persistence.*;
import java.util.Date;

@Erupt(name = "周报", power = @Power(importable = true, export = true))
@Table(name = "weekmanage")
@Entity
public class Catinfo extends BaseModel {

        // 项目类型
        @EruptField(views = {@View(title = "项目类型")}, edit = @Edit(title = "项目类型", type = EditType.CHOICE, notNull = true, choiceType = @ChoiceType(vl = {@VL(value = "1", label = "已上线"), @VL(value = "2", label = "未上线"), @VL(value = "3", label = "其他")})))
        private Integer grade;

        // 周报明细名称
        @EruptField(views = {@View(title = "周报明细名称")}, edit = @Edit(title = "周报明细名称", notNull = true))
        private String title;

        // 责任人
        @EruptField(views = {@View(title = "责任人")}, edit = @Edit(title = "责任人", type = EditType.CHOICE, notNull = true, choiceType = @ChoiceType(vl = {@VL(value = "1", label = "陈国政"), @VL(value = "2", label = "邓影"), @VL(value = "3", label = "段孟环"), @VL(value = "4", label = "崔碧霞"),@VL(value = "5", label = "陈权昌"),@VL(value = "6", label = "陆月颖")})))
        private Integer zerenren;

        // 所属项目
        @EruptField(views = {@View(title = "所属项目")}, edit = @Edit(title = "所属项目", type = EditType.CHOICE, choiceType = @ChoiceType(vl = {@VL(value = "1", label = "政务认证"), @VL(value = "2", label = "公众认证"), @VL(value = "3", label = "信任平台"), @VL(value = "4", label = "标准信息化平台")})))
        private Integer zhoubaomingcheng;

        // 需求个数
        @EruptField(views = {@View(title = "需求个数")}, edit = @Edit(title = "需求个数"))
        private String xuqiu;

        // 缺陷个数
        @EruptField(views = {@View(title = "缺陷个数")}, edit = @Edit(title = "缺陷个数"))
        private String quexian;

        // 用例条数
        @EruptField(views = {@View(title = "用例条数")}, edit = @Edit(title = "用例条数"))
        private String casenum;

        // 周报时间
        @EruptField(views = {@View(title = "周报时间")}, edit = @Edit(title = "周报时间", search = @Search(vague = true), notNull = true))
        private Date date;

        // 备注
        @Lob
        @EruptField(views = {@View(title = "备注", type = ViewType.HTML, export = false)}, edit = @Edit(title = "备注", type = EditType.HTML_EDITOR, notNull = true))
        private String content;
}
