package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.*;
import java.util.Date;

/**
 * Process generated by hbm2java
 */
@Entity
@Table(name="PROCESS"
    ,schema="BDRE"
    ,catalog="BDRE"
)
public class Process  implements java.io.Serializable {


     private Integer processId;
     private String description;
     private Date addTs;
     private String processName;
     private Integer busDomainId;
     private Integer processTypeId;
     private Integer parentProcessId;
     private Boolean canRecover;
     private Integer enqueuingProcessId;
     private String batchCutPattern;
     private String nextProcessId;
     private Boolean deleteFlag;
     private Integer workflowId;
     private Integer processTemplateId;
     private Date editTs;

    public Process() {
    }

	
    public Process(String description, Date addTs, String processName, Integer busDomainId, Integer processTypeId, Integer enqueuingProcessId, String nextProcessId, Date editTs) {
        this.description = description;
        this.addTs = addTs;
        this.processName = processName;
        this.busDomainId = busDomainId;
        this.processTypeId = processTypeId;
        this.enqueuingProcessId = enqueuingProcessId;
        this.nextProcessId = nextProcessId;
        this.editTs = editTs;
    }
    public Process(String description, Date addTs, String processName, Integer busDomainId, Integer processTypeId, Integer parentProcessId, Boolean canRecover, Integer enqueuingProcessId, String batchCutPattern, String nextProcessId, Boolean deleteFlag, Integer workflowId, Integer processTemplateId, Date editTs) {
       this.description = description;
       this.addTs = addTs;
       this.processName = processName;
       this.busDomainId = busDomainId;
       this.processTypeId = processTypeId;
       this.parentProcessId = parentProcessId;
       this.canRecover = canRecover;
       this.enqueuingProcessId = enqueuingProcessId;
       this.batchCutPattern = batchCutPattern;
       this.nextProcessId = nextProcessId;
       this.deleteFlag = deleteFlag;
       this.workflowId = workflowId;
       this.processTemplateId = processTemplateId;
       this.editTs = editTs;
    }
   
     @Id 
    
    @Column(name="PROCESS_ID", unique=true, nullable=false)
    public Integer getProcessId() {
        return this.processId;
    }
    
    public void setProcessId(Integer processId) {
        this.processId = processId;
    }
    
    @Column(name="DESCRIPTION", nullable=false, length=256)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ADD_TS", nullable=false, length=23)
    public Date getAddTs() {
        return this.addTs;
    }
    
    public void setAddTs(Date addTs) {
        this.addTs = addTs;
    }
    
    @Column(name="PROCESS_NAME", nullable=false, length=45)
    public String getProcessName() {
        return this.processName;
    }
    
    public void setProcessName(String processName) {
        this.processName = processName;
    }
    
    @Column(name="BUS_DOMAIN_ID", nullable=false)
    public Integer getBusDomainId() {
        return this.busDomainId;
    }
    
    public void setBusDomainId(Integer busDomainId) {
        this.busDomainId = busDomainId;
    }
    
    @Column(name="PROCESS_TYPE_ID", nullable=false)
    public Integer getProcessTypeId() {
        return this.processTypeId;
    }
    
    public void setProcessTypeId(Integer processTypeId) {
        this.processTypeId = processTypeId;
    }
    
    @Column(name="PARENT_PROCESS_ID")
    public Integer getParentProcessId() {
        return this.parentProcessId;
    }
    
    public void setParentProcessId(Integer parentProcessId) {
        this.parentProcessId = parentProcessId;
    }
    
    @Column(name="CAN_RECOVER")
    public Boolean getCanRecover() {
        return this.canRecover;
    }
    
    public void setCanRecover(Boolean canRecover) {
        this.canRecover = canRecover;
    }
    
    @Column(name="ENQUEUING_PROCESS_ID", nullable=false)
    public Integer getEnqueuingProcessId() {
        return this.enqueuingProcessId;
    }
    
    public void setEnqueuingProcessId(Integer enqueuingProcessId) {
        this.enqueuingProcessId = enqueuingProcessId;
    }
    
    @Column(name="BATCH_CUT_PATTERN", length=45)
    public String getBatchCutPattern() {
        return this.batchCutPattern;
    }
    
    public void setBatchCutPattern(String batchCutPattern) {
        this.batchCutPattern = batchCutPattern;
    }
    
    @Column(name="NEXT_PROCESS_ID", nullable=false, length=256)
    public String getNextProcessId() {
        return this.nextProcessId;
    }
    
    public void setNextProcessId(String nextProcessId) {
        this.nextProcessId = nextProcessId;
    }
    
    @Column(name="DELETE_FLAG")
    public Boolean getDeleteFlag() {
        return this.deleteFlag;
    }
    
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
    
    @Column(name="WORKFLOW_ID")
    public Integer getWorkflowId() {
        return this.workflowId;
    }
    
    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }
    
    @Column(name="PROCESS_TEMPLATE_ID")
    public Integer getProcessTemplateId() {
        return this.processTemplateId;
    }
    
    public void setProcessTemplateId(Integer processTemplateId) {
        this.processTemplateId = processTemplateId;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EDIT_TS", nullable=false, length=23)
    public Date getEditTs() {
        return this.editTs;
    }
    
    public void setEditTs(Date editTs) {
        this.editTs = editTs;
    }




}

