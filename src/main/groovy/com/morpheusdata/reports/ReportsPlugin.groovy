package com.morpheusdata.reports

import com.morpheusdata.core.Plugin

class ReportsPlugin extends Plugin {

  @Override
	String getCode() {
		return 'morpheus-reports-plugin'
	}
  
  @Override
  void initialize() {
    CustomReportProvider customReportProvider = new CustomReportProvider(this, morpheus)
    this.pluginProviders.put(customReportProvider.code, customReportProvider)
    this.setName("Agent Version Report")
    this.setDescription("A custom report plugin for agent versions")
  }

  @Override
  void onDestroy() {
  }
}