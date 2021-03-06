/*
 * Copyright (C) 2001-2016 Food and Agriculture Organization of the
 * United Nations (FAO-UN), United Nations World Food Programme (WFP)
 * and United Nations Environment Programme (UNEP)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
 *
 * Contact: Jeroen Ticheler - FAO - Viale delle Terme di Caracalla 2,
 * Rome - Italy. email: geonetwork@osgeo.org
 */

package org.fao.geonet.repository;

import org.fao.geonet.domain.SchematronCriteria;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Data Access object for the {@link org.fao.geonet.domain.SchematronCriteria} entities.
 *
 * @author delawen
 */
public interface SchematronCriteriaRepository extends
    GeonetRepository<SchematronCriteria, Integer>,
    JpaSpecificationExecutor<SchematronCriteria> {

    /**
     * Get the list of all {@link org.fao.geonet.domain.SchematronCriteria} that are contained in
     * the {@link org.fao.geonet.domain.SchematronCriteriaGroup}
     *
     * @param schematronCriteriaGroupName the name of the in question {@link org.fao.geonet.domain.SchematronCriteriaGroup}
     * @return the list of related schematron criteria
     */
    List<SchematronCriteria> findAllByGroup_Id_Name(String schematronCriteriaGroupName);
}
