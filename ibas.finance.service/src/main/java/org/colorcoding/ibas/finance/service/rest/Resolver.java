package org.colorcoding.ibas.finance.service.rest;

import javax.ws.rs.Produces;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.colorcoding.ibas.bobas.bo.UserFieldProxy;
import org.colorcoding.ibas.bobas.common.Criteria;
import org.colorcoding.ibas.bobas.common.OperationResult;
import org.colorcoding.ibas.finance.bo.dimension.Dimension;
import org.colorcoding.ibas.finance.bo.postingperiod.PostingPeriod;
import org.colorcoding.ibas.finance.bo.project.Project;

/**
 * 序列化解释器
 */
@Provider
@Produces({ "application/json" })
public class Resolver implements ContextResolver<JAXBContext> {

	private static JAXBContext jaxbContext = null;

	public JAXBContext getContext(Class<?> type) {
		try {
			if (jaxbContext == null) {
				jaxbContext = JAXBContext.newInstance(Criteria.class, OperationResult.class, UserFieldProxy.class,
						PostingPeriod.class, Project.class, Dimension.class);
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return jaxbContext;
	}

}
