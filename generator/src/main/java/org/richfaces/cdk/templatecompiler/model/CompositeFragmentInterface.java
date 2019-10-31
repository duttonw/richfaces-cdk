/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.richfaces.cdk.templatecompiler.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Lukas Fryc
 */
@XmlRootElement(name = "interface", namespace = Template.COMPOSITE_NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
public class CompositeFragmentInterface extends ModelFragment implements Serializable {

    private static final long serialVersionUID = -1885511982050527608L;

    @XmlElement(name = "attribute", namespace = Template.COMPOSITE_NAMESPACE)
    private List<CompositeAttribute> attributes;

    public List<CompositeAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<CompositeAttribute> attributes) {
        this.attributes = attributes;
    }
}
