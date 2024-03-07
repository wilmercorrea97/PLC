package com.Invertec.TEST.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "mqttlogs")
public class mqttlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "terminaldate")
    private String terminaldate;
    @Column(name = "group")
    private String group;
    @Column(name = "source")
    private String source;
    @Column(name = "value")
    private String value;
    @Column(name = "ServerTimestamp")
    private Date ServerTimestamp;

    public mqttlog(int id, String terminaldate, String group, String source, String value, Date serverTimestamp) {
        this.id = id;
        this.terminaldate = terminaldate;
        this.group = group;
        this.source = source;
        this.value = value;
        ServerTimestamp = serverTimestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTerminaldate() {
        return terminaldate;
    }

    public void setTerminaldate(String terminaldate) {
        this.terminaldate = terminaldate;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getServerTimestamp() {
        return ServerTimestamp;
    }

    public void setServerTimestamp(Date serverTimestamp) {
        ServerTimestamp = serverTimestamp;
    }
}
