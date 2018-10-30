package org.colorcoding.ibas.finance.service.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.colorcoding.ibas.bobas.common.Criteria;
import org.colorcoding.ibas.bobas.common.OperationResult;
import org.colorcoding.ibas.bobas.cxf.WebServicePath;
import org.colorcoding.ibas.finance.bo.dimension.Dimension;
import org.colorcoding.ibas.finance.bo.postingperiod.PostingPeriod;
import org.colorcoding.ibas.finance.bo.project.Project;
import org.colorcoding.ibas.finance.repository.BORepositoryFinance;

/**
 * Finance 数据服务JSON
 */
@WebService
@WebServicePath("data")
public class DataService extends BORepositoryFinance {

	// --------------------------------------------------------------------------------------------//
	/**
	 * 查询-过账期间
	 * 
	 * @param criteria 查询
	 * @param token    口令
	 * @return 操作结果
	 */
	@WebMethod
	public OperationResult<PostingPeriod> fetchPostingPeriod(@WebParam(name = "criteria") Criteria criteria,
			@WebParam(name = "token") String token) {
		return super.fetchPostingPeriod(criteria, token);
	}

	/**
	 * 保存-过账期间
	 * 
	 * @param bo    对象实例
	 * @param token 口令
	 * @return 操作结果
	 */
	@WebMethod
	public OperationResult<PostingPeriod> savePostingPeriod(@WebParam(name = "bo") PostingPeriod bo,
			@WebParam(name = "token") String token) {
		return super.savePostingPeriod(bo, token);
	}

	// --------------------------------------------------------------------------------------------//
	/**
	 * 查询-项目
	 * 
	 * @param criteria 查询
	 * @param token    口令
	 * @return 操作结果
	 */
	@WebMethod
	public OperationResult<Project> fetchProject(@WebParam(name = "criteria") Criteria criteria,
			@WebParam(name = "token") String token) {
		return super.fetchProject(criteria, token);
	}

	/**
	 * 保存-项目
	 * 
	 * @param bo    对象实例
	 * @param token 口令
	 * @return 操作结果
	 */
	@WebMethod
	public OperationResult<Project> saveProject(@WebParam(name = "bo") Project bo,
			@WebParam(name = "token") String token) {
		return super.saveProject(bo, token);
	}

	// --------------------------------------------------------------------------------------------//
	/**
	 * 查询-维度
	 * 
	 * @param criteria 查询
	 * @param token    口令
	 * @return 操作结果
	 */
	@WebMethod
	public OperationResult<Dimension> fetchDimension(@WebParam(name = "criteria") Criteria criteria,
			@WebParam(name = "token") String token) {
		return super.fetchDimension(criteria, token);
	}

	/**
	 * 保存-维度
	 * 
	 * @param bo    对象实例
	 * @param token 口令
	 * @return 操作结果
	 */
	@WebMethod
	public OperationResult<Dimension> saveDimension(@WebParam(name = "bo") Dimension bo,
			@WebParam(name = "token") String token) {
		return super.saveDimension(bo, token);
	}
	// --------------------------------------------------------------------------------------------//

}
