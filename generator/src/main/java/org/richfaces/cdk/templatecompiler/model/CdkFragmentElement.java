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

import javax.xml.bind.annotation.*;

import org.richfaces.cdk.CdkException;

/**
 * @author Lukas Fryc
 */
@XmlRootElement(name = "fragment", namespace = Template.CDK_NAMESPACE)
@XmlAccessorType(XmlAccessType.NONE)
public class CdkFragmentElement extends ModelFragment implements Serializable {

    private static final long serialVersionUID = -1885511982050527608L;

    @XmlAttribute(required = true)
    private String name;
    @XmlElement(name = "interface", namespace = Template.COMPOSITE_NAMESPACE)
    private CompositeFragmentInterface fragmentInterface;
    @XmlElement(name = "implementation", namespace = Template.COMPOSITE_NAMESPACE)
    private CompositeFragmentImplementation fragmentImplementation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompositeFragmentInterface getFragmentInterface() {
        return fragmentInterface;
    }

    public void setFragmentInterface(CompositeFragmentInterface fragmentInterface) {
        this.fragmentInterface = fragmentInterface;
    }

    public CompositeFragmentImplementation getFragmentImplementation() {
        return fragmentImplementation;
    }

    public void setFragmentImplementation(CompositeFragmentImplementation fragmentImplementation) {
        this.fragmentImplementation = fragmentImplementation;
    }

    @Override
    public void beforeVisit(TemplateVisitor visitor) throws CdkException {
        visitor.preProcess(this);
    }

    @Override
    public void afterVisit(TemplateVisitor visitor) throws CdkException {
        visitor.postProcess(this);
    }

}
