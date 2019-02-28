package com.jk.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TMenu {
    private Integer id;

    private String name;

    private String url;

    private Integer pid;

    private String type;

    private Date createdatetime;
    
    private String createDate;

    private Date modifydatetime;
    
    private String modifydate;

    public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getModifydate() {
		return modifydate;
	}

	public void setModifydate(String modifydate) {
		this.modifydate = modifydate;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCreatedatetime() throws ParseException {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	if (createDate != null && !"".equals(createDate)) {
    		return sdf.parse(createDate);
    	}
        return null;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

    public Date getModifydatetime() throws ParseException {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	if (modifydate != null && !"".equals(modifydate)) {
    		return sdf.parse(modifydate);
    	}
        return null;
    }

    public void setModifydatetime(Date modifydatetime) {
        this.modifydatetime = modifydatetime;
    }

	@Override
	public String toString() {
		return "TMenu [id=" + id + ", name=" + name + ", url=" + url + ", pid="
				+ pid + ", type=" + type + ", createdatetime=" + createdatetime
				+ ", modifydatetime=" + modifydatetime + "]";
	}
    
}