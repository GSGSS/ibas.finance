package org.colorcoding.ibas.finance.repository;

import org.colorcoding.ibas.bobas.common.ICriteria;
import org.colorcoding.ibas.bobas.common.OperationResult;
import org.colorcoding.ibas.bobas.repository.IBORepositorySmartService;
import org.colorcoding.ibas.finance.bo.dimension.Dimension;
import org.colorcoding.ibas.finance.bo.postingperiod.PostingPeriod;
import org.colorcoding.ibas.finance.bo.project.Project;

/**
 * Finance仓库服务
 */
public interface IBORepositoryFinanceSvc extends IBORepositorySmartService {

	// --------------------------------------------------------------------------------------------//
	/**
	 * 查询-过账期间
	 * 
	 * @param criteria 查询
	 * @param token    口令
	 * @return 操作结果
	 */
	OperationResult<PostingPeriod> fetchPostingPeriod(ICriteria criteria, String token);

	/**
	 * 保存-过账期间
	 * 
	 * @param bo    对象实例
	 * @param token 口令
	 * @return 操作结果
	 */
	OperationResult<PostingPeriod> savePostingPeriod(PostingPeriod bo, String token);

	// --------------------------------------------------------------------------------------------//
	/**
	 * 查询-项目
	 * 
	 * @param criteria 查询
	 * @param token    口令
	 * @return 操作结果
	 */
	OperationResult<Project> fetchProject(ICriteria criteria, String token);

	/**
	 * 保存-项目
	 * 
	 * @param bo    对象实例
	 * @param token 口令
	 * @return 操作结果
	 */
	OperationResult<Project> saveProject(Project bo, String token);

	// --------------------------------------------------------------------------------------------//
	/**
	 * 查询-维度
	 * 
	 * @param criteria 查询
	 * @param token    口令
	 * @return 操作结果
	 */
	OperationResult<Dimension> fetchDimension(ICriteria criteria, String token);

	/**
	 * 保存-维度
	 * 
	 * @param bo    对象实例
	 * @param token 口令
	 * @return 操作结果
	 */
	OperationResult<Dimension> saveDimension(Dimension bo, String token);
	// --------------------------------------------------------------------------------------------//

}
