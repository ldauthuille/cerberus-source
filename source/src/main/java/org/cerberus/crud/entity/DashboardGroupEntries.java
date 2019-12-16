/* Cerberus Copyright (C) 2013 - 2017 cerberustesting
 DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.

 This file is part of Cerberus.

 Cerberus is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Cerberus is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Cerberus.  If not, see <http://www.gnu.org/licenses/>.*/
package org.cerberus.crud.entity;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author utilisateur
 */
public class DashboardGroupEntries {

    private Integer id;
    private String codeGroupEntries;
    private User user;
    private List<DashboardEntry> dashboardEntries;
    private String sort;
    private String type;
    private String associateElement;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getCodeGroupEntries() {
        return codeGroupEntries;
    }

    public void setCodeGroupEntries(String codeGroupEntries) {
        this.codeGroupEntries = codeGroupEntries;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<DashboardEntry> getDashboardEntries() {
        return dashboardEntries;
    }

    public void setDashboardEntries(List<DashboardEntry> dashboardEntries) {
        this.dashboardEntries = dashboardEntries;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getAssociateElement() {
        return associateElement;
    }

    public void setAssociateElement(String associateElement) {
        this.associateElement = associateElement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DashboardGroupEntries)) {
            return false;
        }
        DashboardGroupEntries otherObject = (DashboardGroupEntries) other;
        boolean sameCode = otherObject.getCodeGroupEntries().equalsIgnoreCase(this.getCodeGroupEntries());
        boolean sameUser = otherObject.getUser().equals(this.user);
        return sameCode && sameUser;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeGroupEntries, user);
    }

}
