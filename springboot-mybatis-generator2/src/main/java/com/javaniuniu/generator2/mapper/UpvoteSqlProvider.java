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

import com.javaniuniu.generator2.model.Upvote;
import com.javaniuniu.generator2.model.UpvoteExample.Criteria;
import com.javaniuniu.generator2.model.UpvoteExample.Criterion;
import com.javaniuniu.generator2.model.UpvoteExample;
import java.util.List;
import java.util.Map;

public class UpvoteSqlProvider {

    public String countByExample(UpvoteExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("Upvote");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(UpvoteExample example) {
        BEGIN();
        DELETE_FROM("Upvote");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Upvote record) {
        BEGIN();
        INSERT_INTO("Upvote");
        
        if (record.getUpvoteid() != null) {
            VALUES("upvoteID", "#{upvoteid,jdbcType=BIGINT}");
        }
        
        if (record.getDate() != null) {
            VALUES("date", "#{date,jdbcType=VARCHAR}");
        }
        
        if (record.getFrommemberid() != null) {
            VALUES("fromMemberId", "#{frommemberid,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtCreate() != null) {
            VALUES("gmt_create", "#{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModified() != null) {
            VALUES("gmt_modified", "#{gmtModified,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getTomemberid() != null) {
            VALUES("toMemberId", "#{tomemberid,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(UpvoteExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("upvoteID");
        } else {
            SELECT("upvoteID");
        }
        SELECT("date");
        SELECT("fromMemberId");
        SELECT("gmt_create");
        SELECT("gmt_modified");
        SELECT("status");
        SELECT("toMemberId");
        FROM("Upvote");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Upvote record = (Upvote) parameter.get("record");
        UpvoteExample example = (UpvoteExample) parameter.get("example");
        
        BEGIN();
        UPDATE("Upvote");
        
        if (record.getUpvoteid() != null) {
            SET("upvoteID = #{record.upvoteid,jdbcType=BIGINT}");
        }
        
        if (record.getDate() != null) {
            SET("date = #{record.date,jdbcType=VARCHAR}");
        }
        
        if (record.getFrommemberid() != null) {
            SET("fromMemberId = #{record.frommemberid,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtCreate() != null) {
            SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModified() != null) {
            SET("gmt_modified = #{record.gmtModified,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getTomemberid() != null) {
            SET("toMemberId = #{record.tomemberid,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("Upvote");
        
        SET("upvoteID = #{record.upvoteid,jdbcType=BIGINT}");
        SET("date = #{record.date,jdbcType=VARCHAR}");
        SET("fromMemberId = #{record.frommemberid,jdbcType=VARCHAR}");
        SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        SET("gmt_modified = #{record.gmtModified,jdbcType=TIMESTAMP}");
        SET("status = #{record.status,jdbcType=INTEGER}");
        SET("toMemberId = #{record.tomemberid,jdbcType=VARCHAR}");
        
        UpvoteExample example = (UpvoteExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Upvote record) {
        BEGIN();
        UPDATE("Upvote");
        
        if (record.getDate() != null) {
            SET("date = #{date,jdbcType=VARCHAR}");
        }
        
        if (record.getFrommemberid() != null) {
            SET("fromMemberId = #{frommemberid,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtCreate() != null) {
            SET("gmt_create = #{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModified() != null) {
            SET("gmt_modified = #{gmtModified,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getTomemberid() != null) {
            SET("toMemberId = #{tomemberid,jdbcType=VARCHAR}");
        }
        
        WHERE("upvoteID = #{upvoteid,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(UpvoteExample example, boolean includeExamplePhrase) {
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