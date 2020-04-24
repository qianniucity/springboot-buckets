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

import com.javaniuniu.generator2.model.Problem;
import com.javaniuniu.generator2.model.ProblemExample.Criteria;
import com.javaniuniu.generator2.model.ProblemExample.Criterion;
import com.javaniuniu.generator2.model.ProblemExample;
import java.util.List;
import java.util.Map;

public class ProblemSqlProvider {

    public String countByExample(ProblemExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("Problem");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(ProblemExample example) {
        BEGIN();
        DELETE_FROM("Problem");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Problem record) {
        BEGIN();
        INSERT_INTO("Problem");
        
        if (record.getProblemid() != null) {
            VALUES("problemID", "#{problemid,jdbcType=BIGINT}");
        }
        
        if (record.getCnurl() != null) {
            VALUES("cnUrl", "#{cnurl,jdbcType=VARCHAR}");
        }
        
        if (record.getDate() != null) {
            VALUES("date", "#{date,jdbcType=VARCHAR}");
        }
        
        if (record.getEnurl() != null) {
            VALUES("enUrl", "#{enurl,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexnum() != null) {
            VALUES("indexNum", "#{indexnum,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getQuestiontitleslug() != null) {
            VALUES("questionTitleSlug", "#{questiontitleslug,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(ProblemExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("problemID");
        } else {
            SELECT("problemID");
        }
        SELECT("cnUrl");
        SELECT("date");
        SELECT("enUrl");
        SELECT("indexNum");
        SELECT("name");
        SELECT("questionTitleSlug");
        FROM("Problem");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Problem record = (Problem) parameter.get("record");
        ProblemExample example = (ProblemExample) parameter.get("example");
        
        BEGIN();
        UPDATE("Problem");
        
        if (record.getProblemid() != null) {
            SET("problemID = #{record.problemid,jdbcType=BIGINT}");
        }
        
        if (record.getCnurl() != null) {
            SET("cnUrl = #{record.cnurl,jdbcType=VARCHAR}");
        }
        
        if (record.getDate() != null) {
            SET("date = #{record.date,jdbcType=VARCHAR}");
        }
        
        if (record.getEnurl() != null) {
            SET("enUrl = #{record.enurl,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexnum() != null) {
            SET("indexNum = #{record.indexnum,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getQuestiontitleslug() != null) {
            SET("questionTitleSlug = #{record.questiontitleslug,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("Problem");
        
        SET("problemID = #{record.problemid,jdbcType=BIGINT}");
        SET("cnUrl = #{record.cnurl,jdbcType=VARCHAR}");
        SET("date = #{record.date,jdbcType=VARCHAR}");
        SET("enUrl = #{record.enurl,jdbcType=VARCHAR}");
        SET("indexNum = #{record.indexnum,jdbcType=VARCHAR}");
        SET("name = #{record.name,jdbcType=VARCHAR}");
        SET("questionTitleSlug = #{record.questiontitleslug,jdbcType=VARCHAR}");
        
        ProblemExample example = (ProblemExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Problem record) {
        BEGIN();
        UPDATE("Problem");
        
        if (record.getCnurl() != null) {
            SET("cnUrl = #{cnurl,jdbcType=VARCHAR}");
        }
        
        if (record.getDate() != null) {
            SET("date = #{date,jdbcType=VARCHAR}");
        }
        
        if (record.getEnurl() != null) {
            SET("enUrl = #{enurl,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexnum() != null) {
            SET("indexNum = #{indexnum,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getQuestiontitleslug() != null) {
            SET("questionTitleSlug = #{questiontitleslug,jdbcType=VARCHAR}");
        }
        
        WHERE("problemID = #{problemid,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(ProblemExample example, boolean includeExamplePhrase) {
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