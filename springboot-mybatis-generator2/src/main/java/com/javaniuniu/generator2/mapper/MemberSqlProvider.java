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

import com.javaniuniu.generator2.model.Member;
import com.javaniuniu.generator2.model.MemberExample.Criteria;
import com.javaniuniu.generator2.model.MemberExample.Criterion;
import com.javaniuniu.generator2.model.MemberExample;
import java.util.List;
import java.util.Map;

public class MemberSqlProvider {

    public String countByExample(MemberExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("Member");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(MemberExample example) {
        BEGIN();
        DELETE_FROM("Member");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Member record) {
        BEGIN();
        INSERT_INTO("Member");
        
        if (record.getMemberid() != null) {
            VALUES("memberId", "#{memberid,jdbcType=BIGINT}");
        }
        
        if (record.getAcceptancerate() != null) {
            VALUES("acceptanceRate", "#{acceptancerate,jdbcType=DOUBLE}");
        }
        
        if (record.getAcceptedsubmission() != null) {
            VALUES("acceptedSubmission", "#{acceptedsubmission,jdbcType=INTEGER}");
        }
        
        if (record.getAddress() != null) {
            VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            VALUES("avatar", "#{avatar,jdbcType=VARCHAR}");
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
        
        if (record.getGmtCreate() != null) {
            VALUES("gmt_create", "#{gmtCreate,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtModified() != null) {
            VALUES("gmt_modified", "#{gmtModified,jdbcType=VARCHAR}");
        }
        
        if (record.getPlatform() != null) {
            VALUES("platform", "#{platform,jdbcType=VARCHAR}");
        }
        
        if (record.getSolvedquestion() != null) {
            VALUES("solvedQuestion", "#{solvedquestion,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getSubmissioncount() != null) {
            VALUES("submissionCount", "#{submissioncount,jdbcType=INTEGER}");
        }
        
        if (record.getTotalchecked() != null) {
            VALUES("totalChecked", "#{totalchecked,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getWebsite() != null) {
            VALUES("website", "#{website,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(MemberExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("memberId");
        } else {
            SELECT("memberId");
        }
        SELECT("acceptanceRate");
        SELECT("acceptedSubmission");
        SELECT("address");
        SELECT("avatar");
        SELECT("cnUrl");
        SELECT("date");
        SELECT("enUrl");
        SELECT("gmt_create");
        SELECT("gmt_modified");
        SELECT("platform");
        SELECT("solvedQuestion");
        SELECT("status");
        SELECT("submissionCount");
        SELECT("totalChecked");
        SELECT("username");
        SELECT("website");
        FROM("Member");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Member record = (Member) parameter.get("record");
        MemberExample example = (MemberExample) parameter.get("example");
        
        BEGIN();
        UPDATE("Member");
        
        if (record.getMemberid() != null) {
            SET("memberId = #{record.memberid,jdbcType=BIGINT}");
        }
        
        if (record.getAcceptancerate() != null) {
            SET("acceptanceRate = #{record.acceptancerate,jdbcType=DOUBLE}");
        }
        
        if (record.getAcceptedsubmission() != null) {
            SET("acceptedSubmission = #{record.acceptedsubmission,jdbcType=INTEGER}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            SET("avatar = #{record.avatar,jdbcType=VARCHAR}");
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
        
        if (record.getGmtCreate() != null) {
            SET("gmt_create = #{record.gmtCreate,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtModified() != null) {
            SET("gmt_modified = #{record.gmtModified,jdbcType=VARCHAR}");
        }
        
        if (record.getPlatform() != null) {
            SET("platform = #{record.platform,jdbcType=VARCHAR}");
        }
        
        if (record.getSolvedquestion() != null) {
            SET("solvedQuestion = #{record.solvedquestion,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getSubmissioncount() != null) {
            SET("submissionCount = #{record.submissioncount,jdbcType=INTEGER}");
        }
        
        if (record.getTotalchecked() != null) {
            SET("totalChecked = #{record.totalchecked,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getWebsite() != null) {
            SET("website = #{record.website,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("Member");
        
        SET("memberId = #{record.memberid,jdbcType=BIGINT}");
        SET("acceptanceRate = #{record.acceptancerate,jdbcType=DOUBLE}");
        SET("acceptedSubmission = #{record.acceptedsubmission,jdbcType=INTEGER}");
        SET("address = #{record.address,jdbcType=VARCHAR}");
        SET("avatar = #{record.avatar,jdbcType=VARCHAR}");
        SET("cnUrl = #{record.cnurl,jdbcType=VARCHAR}");
        SET("date = #{record.date,jdbcType=VARCHAR}");
        SET("enUrl = #{record.enurl,jdbcType=VARCHAR}");
        SET("gmt_create = #{record.gmtCreate,jdbcType=VARCHAR}");
        SET("gmt_modified = #{record.gmtModified,jdbcType=VARCHAR}");
        SET("platform = #{record.platform,jdbcType=VARCHAR}");
        SET("solvedQuestion = #{record.solvedquestion,jdbcType=INTEGER}");
        SET("status = #{record.status,jdbcType=INTEGER}");
        SET("submissionCount = #{record.submissioncount,jdbcType=INTEGER}");
        SET("totalChecked = #{record.totalchecked,jdbcType=INTEGER}");
        SET("username = #{record.username,jdbcType=VARCHAR}");
        SET("website = #{record.website,jdbcType=VARCHAR}");
        
        MemberExample example = (MemberExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Member record) {
        BEGIN();
        UPDATE("Member");
        
        if (record.getAcceptancerate() != null) {
            SET("acceptanceRate = #{acceptancerate,jdbcType=DOUBLE}");
        }
        
        if (record.getAcceptedsubmission() != null) {
            SET("acceptedSubmission = #{acceptedsubmission,jdbcType=INTEGER}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            SET("avatar = #{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getCnurl() != null) {
            SET("cnUrl = #{cnurl,jdbcType=VARCHAR}");
        }
        
        if (record.getDate() != null) {
            SET("date = #{date,jdbcType=VARCHAR}");
        }
        
        if (record.getEnurl() != null) {
            SET("enUrl = #{enurl,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtCreate() != null) {
            SET("gmt_create = #{gmtCreate,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtModified() != null) {
            SET("gmt_modified = #{gmtModified,jdbcType=VARCHAR}");
        }
        
        if (record.getPlatform() != null) {
            SET("platform = #{platform,jdbcType=VARCHAR}");
        }
        
        if (record.getSolvedquestion() != null) {
            SET("solvedQuestion = #{solvedquestion,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getSubmissioncount() != null) {
            SET("submissionCount = #{submissioncount,jdbcType=INTEGER}");
        }
        
        if (record.getTotalchecked() != null) {
            SET("totalChecked = #{totalchecked,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getWebsite() != null) {
            SET("website = #{website,jdbcType=VARCHAR}");
        }
        
        WHERE("memberId = #{memberid,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(MemberExample example, boolean includeExamplePhrase) {
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