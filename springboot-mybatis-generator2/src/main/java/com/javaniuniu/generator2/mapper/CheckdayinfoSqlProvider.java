package com.javaniuniu.generator2.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.javaniuniu.generator2.model.Checkdayinfo;
import com.javaniuniu.generator2.model.CheckdayinfoExample.Criteria;
import com.javaniuniu.generator2.model.CheckdayinfoExample.Criterion;
import com.javaniuniu.generator2.model.CheckdayinfoExample;
import java.util.List;
import java.util.Map;

public class CheckdayinfoSqlProvider {

    public String countByExample(CheckdayinfoExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("CheckDayInfo");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(CheckdayinfoExample example) {
        BEGIN();
        DELETE_FROM("CheckDayInfo");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Checkdayinfo record) {
        BEGIN();
        INSERT_INTO("CheckDayInfo");
        
        if (record.getInfoid() != null) {
            VALUES("infoId", "#{infoid,jdbcType=BIGINT}");
        }
        
        if (record.getCheckdaysinthelastyear() != null) {
            VALUES("checkDaysInTheLastYear", "#{checkdaysinthelastyear,jdbcType=INTEGER}");
        }
        
        if (record.getChecked() != null) {
            VALUES("checked", "#{checked,jdbcType=INTEGER}");
        }
        
        if (record.getCheckedtime() != null) {
            VALUES("checkedTime", "#{checkedtime,jdbcType=VARCHAR}");
        }
        
        if (record.getDate() != null) {
            VALUES("date", "#{date,jdbcType=VARCHAR}");
        }
        
        if (record.getSolvedproblemnumberoftoday() != null) {
            VALUES("solvedProblemNumberOfToday", "#{solvedproblemnumberoftoday,jdbcType=INTEGER}");
        }
        
        if (record.getSubmissionoftoday() != null) {
            VALUES("submissionOfToday", "#{submissionoftoday,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatetime() != null) {
            VALUES("updateTime", "#{updatetime,jdbcType=VARCHAR}");
        }
        
        if (record.getUpvotenumber() != null) {
            VALUES("upvoteNumber", "#{upvotenumber,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(CheckdayinfoExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("infoId");
        } else {
            SELECT("infoId");
        }
        SELECT("checkDaysInTheLastYear");
        SELECT("checked");
        SELECT("checkedTime");
        SELECT("date");
        SELECT("solvedProblemNumberOfToday");
        SELECT("submissionOfToday");
        SELECT("updateTime");
        SELECT("upvoteNumber");
        SELECT("username");
        FROM("CheckDayInfo");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Checkdayinfo record = (Checkdayinfo) parameter.get("record");
        CheckdayinfoExample example = (CheckdayinfoExample) parameter.get("example");
        
        BEGIN();
        UPDATE("CheckDayInfo");
        
        if (record.getInfoid() != null) {
            SET("infoId = #{record.infoid,jdbcType=BIGINT}");
        }
        
        if (record.getCheckdaysinthelastyear() != null) {
            SET("checkDaysInTheLastYear = #{record.checkdaysinthelastyear,jdbcType=INTEGER}");
        }
        
        if (record.getChecked() != null) {
            SET("checked = #{record.checked,jdbcType=INTEGER}");
        }
        
        if (record.getCheckedtime() != null) {
            SET("checkedTime = #{record.checkedtime,jdbcType=VARCHAR}");
        }
        
        if (record.getDate() != null) {
            SET("date = #{record.date,jdbcType=VARCHAR}");
        }
        
        if (record.getSolvedproblemnumberoftoday() != null) {
            SET("solvedProblemNumberOfToday = #{record.solvedproblemnumberoftoday,jdbcType=INTEGER}");
        }
        
        if (record.getSubmissionoftoday() != null) {
            SET("submissionOfToday = #{record.submissionoftoday,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatetime() != null) {
            SET("updateTime = #{record.updatetime,jdbcType=VARCHAR}");
        }
        
        if (record.getUpvotenumber() != null) {
            SET("upvoteNumber = #{record.upvotenumber,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("CheckDayInfo");
        
        SET("infoId = #{record.infoid,jdbcType=BIGINT}");
        SET("checkDaysInTheLastYear = #{record.checkdaysinthelastyear,jdbcType=INTEGER}");
        SET("checked = #{record.checked,jdbcType=INTEGER}");
        SET("checkedTime = #{record.checkedtime,jdbcType=VARCHAR}");
        SET("date = #{record.date,jdbcType=VARCHAR}");
        SET("solvedProblemNumberOfToday = #{record.solvedproblemnumberoftoday,jdbcType=INTEGER}");
        SET("submissionOfToday = #{record.submissionoftoday,jdbcType=INTEGER}");
        SET("updateTime = #{record.updatetime,jdbcType=VARCHAR}");
        SET("upvoteNumber = #{record.upvotenumber,jdbcType=INTEGER}");
        SET("username = #{record.username,jdbcType=VARCHAR}");
        
        CheckdayinfoExample example = (CheckdayinfoExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Checkdayinfo record) {
        BEGIN();
        UPDATE("CheckDayInfo");
        
        if (record.getCheckdaysinthelastyear() != null) {
            SET("checkDaysInTheLastYear = #{checkdaysinthelastyear,jdbcType=INTEGER}");
        }
        
        if (record.getChecked() != null) {
            SET("checked = #{checked,jdbcType=INTEGER}");
        }
        
        if (record.getCheckedtime() != null) {
            SET("checkedTime = #{checkedtime,jdbcType=VARCHAR}");
        }
        
        if (record.getDate() != null) {
            SET("date = #{date,jdbcType=VARCHAR}");
        }
        
        if (record.getSolvedproblemnumberoftoday() != null) {
            SET("solvedProblemNumberOfToday = #{solvedproblemnumberoftoday,jdbcType=INTEGER}");
        }
        
        if (record.getSubmissionoftoday() != null) {
            SET("submissionOfToday = #{submissionoftoday,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatetime() != null) {
            SET("updateTime = #{updatetime,jdbcType=VARCHAR}");
        }
        
        if (record.getUpvotenumber() != null) {
            SET("upvoteNumber = #{upvotenumber,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        WHERE("infoId = #{infoid,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(CheckdayinfoExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}