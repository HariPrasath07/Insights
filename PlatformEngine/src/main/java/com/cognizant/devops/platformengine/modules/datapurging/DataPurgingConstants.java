package com.cognizant.devops.platformengine.modules.datapurging;

import com.cognizant.devops.platformcommons.config.ApplicationConfigProvider;

public interface DataPurgingConstants {
	String ES_HOST = ApplicationConfigProvider.getInstance().getEndpointData().getElasticSearchEndpoint();
	String ES_CACHE_INDEX = ApplicationConfigProvider.getInstance().getQueryCache().getEsCacheIndex();
	String DEFAULT_ES_CACHE_INDEX = "neo4j-cached-results/querycacheresults";
	int PURGE_ES_RESULTS_BEFORE = ApplicationConfigProvider.getInstance().getQueryCache().getPurgeEsResultsBefore();
}
