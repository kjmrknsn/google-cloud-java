// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface JobQueryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.JobQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional.
   * The query string that matches against the job title, description, and
   * location fields.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string query = 1;</code>
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Optional.
   * The query string that matches against the job title, description, and
   * location fields.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string query = 1;</code>
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies the company entities to search against.
   * If a value isn't specified, jobs are searched for against all
   * companies.
   * If multiple values are specified, jobs are searched against the
   * companies specified.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/api-test-project/tenants/foo/companies/bar".
   * Tenant id is optional and the default tenant is used if unspecified, for
   * example, "projects/api-test-project/companies/bar".
   * At most 20 company filters are allowed.
   * </pre>
   *
   * <code>repeated string companies = 2;</code>
   */
  java.util.List<java.lang.String> getCompaniesList();
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies the company entities to search against.
   * If a value isn't specified, jobs are searched for against all
   * companies.
   * If multiple values are specified, jobs are searched against the
   * companies specified.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/api-test-project/tenants/foo/companies/bar".
   * Tenant id is optional and the default tenant is used if unspecified, for
   * example, "projects/api-test-project/companies/bar".
   * At most 20 company filters are allowed.
   * </pre>
   *
   * <code>repeated string companies = 2;</code>
   */
  int getCompaniesCount();
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies the company entities to search against.
   * If a value isn't specified, jobs are searched for against all
   * companies.
   * If multiple values are specified, jobs are searched against the
   * companies specified.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/api-test-project/tenants/foo/companies/bar".
   * Tenant id is optional and the default tenant is used if unspecified, for
   * example, "projects/api-test-project/companies/bar".
   * At most 20 company filters are allowed.
   * </pre>
   *
   * <code>repeated string companies = 2;</code>
   */
  java.lang.String getCompanies(int index);
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies the company entities to search against.
   * If a value isn't specified, jobs are searched for against all
   * companies.
   * If multiple values are specified, jobs are searched against the
   * companies specified.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/api-test-project/tenants/foo/companies/bar".
   * Tenant id is optional and the default tenant is used if unspecified, for
   * example, "projects/api-test-project/companies/bar".
   * At most 20 company filters are allowed.
   * </pre>
   *
   * <code>repeated string companies = 2;</code>
   */
  com.google.protobuf.ByteString getCompaniesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional.
   * The location filter specifies geo-regions containing the jobs to
   * search against. See [LocationFilter][google.cloud.talent.v4beta1.LocationFilter] for more information.
   * If a location value isn't specified, jobs fitting the other search
   * criteria are retrieved regardless of where they're located.
   * If multiple values are specified, jobs are retrieved from any of the
   * specified locations. If different values are specified for the
   * [LocationFilter.distance_in_miles][google.cloud.talent.v4beta1.LocationFilter.distance_in_miles] parameter, the maximum provided
   * distance is used for all locations.
   * At most 5 location filters are allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.LocationFilter location_filters = 3;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.LocationFilter> getLocationFiltersList();
  /**
   *
   *
   * <pre>
   * Optional.
   * The location filter specifies geo-regions containing the jobs to
   * search against. See [LocationFilter][google.cloud.talent.v4beta1.LocationFilter] for more information.
   * If a location value isn't specified, jobs fitting the other search
   * criteria are retrieved regardless of where they're located.
   * If multiple values are specified, jobs are retrieved from any of the
   * specified locations. If different values are specified for the
   * [LocationFilter.distance_in_miles][google.cloud.talent.v4beta1.LocationFilter.distance_in_miles] parameter, the maximum provided
   * distance is used for all locations.
   * At most 5 location filters are allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.LocationFilter location_filters = 3;</code>
   */
  com.google.cloud.talent.v4beta1.LocationFilter getLocationFilters(int index);
  /**
   *
   *
   * <pre>
   * Optional.
   * The location filter specifies geo-regions containing the jobs to
   * search against. See [LocationFilter][google.cloud.talent.v4beta1.LocationFilter] for more information.
   * If a location value isn't specified, jobs fitting the other search
   * criteria are retrieved regardless of where they're located.
   * If multiple values are specified, jobs are retrieved from any of the
   * specified locations. If different values are specified for the
   * [LocationFilter.distance_in_miles][google.cloud.talent.v4beta1.LocationFilter.distance_in_miles] parameter, the maximum provided
   * distance is used for all locations.
   * At most 5 location filters are allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.LocationFilter location_filters = 3;</code>
   */
  int getLocationFiltersCount();
  /**
   *
   *
   * <pre>
   * Optional.
   * The location filter specifies geo-regions containing the jobs to
   * search against. See [LocationFilter][google.cloud.talent.v4beta1.LocationFilter] for more information.
   * If a location value isn't specified, jobs fitting the other search
   * criteria are retrieved regardless of where they're located.
   * If multiple values are specified, jobs are retrieved from any of the
   * specified locations. If different values are specified for the
   * [LocationFilter.distance_in_miles][google.cloud.talent.v4beta1.LocationFilter.distance_in_miles] parameter, the maximum provided
   * distance is used for all locations.
   * At most 5 location filters are allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.LocationFilter location_filters = 3;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.LocationFilterOrBuilder>
      getLocationFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional.
   * The location filter specifies geo-regions containing the jobs to
   * search against. See [LocationFilter][google.cloud.talent.v4beta1.LocationFilter] for more information.
   * If a location value isn't specified, jobs fitting the other search
   * criteria are retrieved regardless of where they're located.
   * If multiple values are specified, jobs are retrieved from any of the
   * specified locations. If different values are specified for the
   * [LocationFilter.distance_in_miles][google.cloud.talent.v4beta1.LocationFilter.distance_in_miles] parameter, the maximum provided
   * distance is used for all locations.
   * At most 5 location filters are allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.LocationFilter location_filters = 3;</code>
   */
  com.google.cloud.talent.v4beta1.LocationFilterOrBuilder getLocationFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional.
   * The category filter specifies the categories of jobs to search against.
   * See [Category][] for more information.
   * If a value isn't specified, jobs from any category are searched against.
   * If multiple values are specified, jobs from any of the specified
   * categories are searched against.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.JobCategory job_categories = 4;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.JobCategory> getJobCategoriesList();
  /**
   *
   *
   * <pre>
   * Optional.
   * The category filter specifies the categories of jobs to search against.
   * See [Category][] for more information.
   * If a value isn't specified, jobs from any category are searched against.
   * If multiple values are specified, jobs from any of the specified
   * categories are searched against.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.JobCategory job_categories = 4;</code>
   */
  int getJobCategoriesCount();
  /**
   *
   *
   * <pre>
   * Optional.
   * The category filter specifies the categories of jobs to search against.
   * See [Category][] for more information.
   * If a value isn't specified, jobs from any category are searched against.
   * If multiple values are specified, jobs from any of the specified
   * categories are searched against.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.JobCategory job_categories = 4;</code>
   */
  com.google.cloud.talent.v4beta1.JobCategory getJobCategories(int index);
  /**
   *
   *
   * <pre>
   * Optional.
   * The category filter specifies the categories of jobs to search against.
   * See [Category][] for more information.
   * If a value isn't specified, jobs from any category are searched against.
   * If multiple values are specified, jobs from any of the specified
   * categories are searched against.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.JobCategory job_categories = 4;</code>
   */
  java.util.List<java.lang.Integer> getJobCategoriesValueList();
  /**
   *
   *
   * <pre>
   * Optional.
   * The category filter specifies the categories of jobs to search against.
   * See [Category][] for more information.
   * If a value isn't specified, jobs from any category are searched against.
   * If multiple values are specified, jobs from any of the specified
   * categories are searched against.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.JobCategory job_categories = 4;</code>
   */
  int getJobCategoriesValue(int index);

  /**
   *
   *
   * <pre>
   * Optional.
   *  Allows filtering jobs by commute time with different travel methods (for
   *  example, driving or public transit). Note: This only works with [COMMUTE
   *  MODE][Mode#COMMUTE]. When specified, [JobQuery.location_filters] is
   *  ignored.
   *  Currently we don't support sorting by commute time.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CommuteFilter commute_filter = 5;</code>
   */
  boolean hasCommuteFilter();
  /**
   *
   *
   * <pre>
   * Optional.
   *  Allows filtering jobs by commute time with different travel methods (for
   *  example, driving or public transit). Note: This only works with [COMMUTE
   *  MODE][Mode#COMMUTE]. When specified, [JobQuery.location_filters] is
   *  ignored.
   *  Currently we don't support sorting by commute time.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CommuteFilter commute_filter = 5;</code>
   */
  com.google.cloud.talent.v4beta1.CommuteFilter getCommuteFilter();
  /**
   *
   *
   * <pre>
   * Optional.
   *  Allows filtering jobs by commute time with different travel methods (for
   *  example, driving or public transit). Note: This only works with [COMMUTE
   *  MODE][Mode#COMMUTE]. When specified, [JobQuery.location_filters] is
   *  ignored.
   *  Currently we don't support sorting by commute time.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CommuteFilter commute_filter = 5;</code>
   */
  com.google.cloud.talent.v4beta1.CommuteFilterOrBuilder getCommuteFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies the exact [company display
   * name][Company.display_name] of the jobs to search against.
   * If a value isn't specified, jobs within the search results are
   * associated with any company.
   * If multiple values are specified, jobs within the search results may be
   * associated with any of the specified companies.
   * At most 20 company display name filters are allowed.
   * </pre>
   *
   * <code>repeated string company_display_names = 6;</code>
   */
  java.util.List<java.lang.String> getCompanyDisplayNamesList();
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies the exact [company display
   * name][Company.display_name] of the jobs to search against.
   * If a value isn't specified, jobs within the search results are
   * associated with any company.
   * If multiple values are specified, jobs within the search results may be
   * associated with any of the specified companies.
   * At most 20 company display name filters are allowed.
   * </pre>
   *
   * <code>repeated string company_display_names = 6;</code>
   */
  int getCompanyDisplayNamesCount();
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies the exact [company display
   * name][Company.display_name] of the jobs to search against.
   * If a value isn't specified, jobs within the search results are
   * associated with any company.
   * If multiple values are specified, jobs within the search results may be
   * associated with any of the specified companies.
   * At most 20 company display name filters are allowed.
   * </pre>
   *
   * <code>repeated string company_display_names = 6;</code>
   */
  java.lang.String getCompanyDisplayNames(int index);
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies the exact [company display
   * name][Company.display_name] of the jobs to search against.
   * If a value isn't specified, jobs within the search results are
   * associated with any company.
   * If multiple values are specified, jobs within the search results may be
   * associated with any of the specified companies.
   * At most 20 company display name filters are allowed.
   * </pre>
   *
   * <code>repeated string company_display_names = 6;</code>
   */
  com.google.protobuf.ByteString getCompanyDisplayNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional.
   * This search filter is applied only to
   * [Job.compensation_info][google.cloud.talent.v4beta1.Job.compensation_info]. For example, if the filter is specified
   * as "Hourly job with per-hour compensation &gt; $15", only jobs meeting
   * these criteria are searched. If a filter isn't defined, all open jobs
   * are searched.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompensationFilter compensation_filter = 7;</code>
   */
  boolean hasCompensationFilter();
  /**
   *
   *
   * <pre>
   * Optional.
   * This search filter is applied only to
   * [Job.compensation_info][google.cloud.talent.v4beta1.Job.compensation_info]. For example, if the filter is specified
   * as "Hourly job with per-hour compensation &gt; $15", only jobs meeting
   * these criteria are searched. If a filter isn't defined, all open jobs
   * are searched.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompensationFilter compensation_filter = 7;</code>
   */
  com.google.cloud.talent.v4beta1.CompensationFilter getCompensationFilter();
  /**
   *
   *
   * <pre>
   * Optional.
   * This search filter is applied only to
   * [Job.compensation_info][google.cloud.talent.v4beta1.Job.compensation_info]. For example, if the filter is specified
   * as "Hourly job with per-hour compensation &gt; $15", only jobs meeting
   * these criteria are searched. If a filter isn't defined, all open jobs
   * are searched.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompensationFilter compensation_filter = 7;</code>
   */
  com.google.cloud.talent.v4beta1.CompensationFilterOrBuilder getCompensationFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies a structured syntax to match against the
   * [Job.custom_attributes][google.cloud.talent.v4beta1.Job.custom_attributes] marked as `filterable`.
   * The syntax for this expression is a subset of SQL syntax.
   * Supported operators are: `=`, `!=`, `&lt;`, `&lt;=`, `&gt;`, and `&gt;=` where the
   * left of the operator is a custom field key and the right of the operator
   * is a number or a quoted string. You must escape backslash (&#92;&#92;) and
   * quote (&#92;") characters.
   * Supported functions are `LOWER([field_name])` to
   * perform a case insensitive match and `EMPTY([field_name])` to filter on the
   * existence of a key.
   * Boolean expressions (AND/OR/NOT) are supported up to 3 levels of
   * nesting (for example, "((A AND B AND C) OR NOT D) AND E"), a maximum of 100
   * comparisons or functions are allowed in the expression. The expression
   * must be &lt; 3000 bytes in length.
   * Sample Query:
   * `(LOWER(driving_license)="class &#92;"a&#92;"" OR EMPTY(driving_license)) AND
   * driving_years &gt; 10`
   * </pre>
   *
   * <code>string custom_attribute_filter = 8;</code>
   */
  java.lang.String getCustomAttributeFilter();
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies a structured syntax to match against the
   * [Job.custom_attributes][google.cloud.talent.v4beta1.Job.custom_attributes] marked as `filterable`.
   * The syntax for this expression is a subset of SQL syntax.
   * Supported operators are: `=`, `!=`, `&lt;`, `&lt;=`, `&gt;`, and `&gt;=` where the
   * left of the operator is a custom field key and the right of the operator
   * is a number or a quoted string. You must escape backslash (&#92;&#92;) and
   * quote (&#92;") characters.
   * Supported functions are `LOWER([field_name])` to
   * perform a case insensitive match and `EMPTY([field_name])` to filter on the
   * existence of a key.
   * Boolean expressions (AND/OR/NOT) are supported up to 3 levels of
   * nesting (for example, "((A AND B AND C) OR NOT D) AND E"), a maximum of 100
   * comparisons or functions are allowed in the expression. The expression
   * must be &lt; 3000 bytes in length.
   * Sample Query:
   * `(LOWER(driving_license)="class &#92;"a&#92;"" OR EMPTY(driving_license)) AND
   * driving_years &gt; 10`
   * </pre>
   *
   * <code>string custom_attribute_filter = 8;</code>
   */
  com.google.protobuf.ByteString getCustomAttributeFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * This flag controls the spell-check feature. If false, the
   * service attempts to correct a misspelled query,
   * for example, "enginee" is corrected to "engineer".
   * Defaults to false: a spell check is performed.
   * </pre>
   *
   * <code>bool disable_spell_check = 9;</code>
   */
  boolean getDisableSpellCheck();

  /**
   *
   *
   * <pre>
   * Optional.
   * The employment type filter specifies the employment type of jobs to
   * search against, such as [EmploymentType.FULL_TIME][google.cloud.talent.v4beta1.EmploymentType.FULL_TIME].
   * If a value isn't specified, jobs in the search results includes any
   * employment type.
   * If multiple values are specified, jobs in the search results include
   * any of the specified employment types.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EmploymentType employment_types = 10;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.EmploymentType> getEmploymentTypesList();
  /**
   *
   *
   * <pre>
   * Optional.
   * The employment type filter specifies the employment type of jobs to
   * search against, such as [EmploymentType.FULL_TIME][google.cloud.talent.v4beta1.EmploymentType.FULL_TIME].
   * If a value isn't specified, jobs in the search results includes any
   * employment type.
   * If multiple values are specified, jobs in the search results include
   * any of the specified employment types.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EmploymentType employment_types = 10;</code>
   */
  int getEmploymentTypesCount();
  /**
   *
   *
   * <pre>
   * Optional.
   * The employment type filter specifies the employment type of jobs to
   * search against, such as [EmploymentType.FULL_TIME][google.cloud.talent.v4beta1.EmploymentType.FULL_TIME].
   * If a value isn't specified, jobs in the search results includes any
   * employment type.
   * If multiple values are specified, jobs in the search results include
   * any of the specified employment types.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EmploymentType employment_types = 10;</code>
   */
  com.google.cloud.talent.v4beta1.EmploymentType getEmploymentTypes(int index);
  /**
   *
   *
   * <pre>
   * Optional.
   * The employment type filter specifies the employment type of jobs to
   * search against, such as [EmploymentType.FULL_TIME][google.cloud.talent.v4beta1.EmploymentType.FULL_TIME].
   * If a value isn't specified, jobs in the search results includes any
   * employment type.
   * If multiple values are specified, jobs in the search results include
   * any of the specified employment types.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EmploymentType employment_types = 10;</code>
   */
  java.util.List<java.lang.Integer> getEmploymentTypesValueList();
  /**
   *
   *
   * <pre>
   * Optional.
   * The employment type filter specifies the employment type of jobs to
   * search against, such as [EmploymentType.FULL_TIME][google.cloud.talent.v4beta1.EmploymentType.FULL_TIME].
   * If a value isn't specified, jobs in the search results includes any
   * employment type.
   * If multiple values are specified, jobs in the search results include
   * any of the specified employment types.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EmploymentType employment_types = 10;</code>
   */
  int getEmploymentTypesValue(int index);

  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies the locale of jobs to search against,
   * for example, "en-US".
   * If a value isn't specified, the search results can contain jobs in any
   * locale.
   * Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * At most 10 language code filters are allowed.
   * </pre>
   *
   * <code>repeated string language_codes = 11;</code>
   */
  java.util.List<java.lang.String> getLanguageCodesList();
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies the locale of jobs to search against,
   * for example, "en-US".
   * If a value isn't specified, the search results can contain jobs in any
   * locale.
   * Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * At most 10 language code filters are allowed.
   * </pre>
   *
   * <code>repeated string language_codes = 11;</code>
   */
  int getLanguageCodesCount();
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies the locale of jobs to search against,
   * for example, "en-US".
   * If a value isn't specified, the search results can contain jobs in any
   * locale.
   * Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * At most 10 language code filters are allowed.
   * </pre>
   *
   * <code>repeated string language_codes = 11;</code>
   */
  java.lang.String getLanguageCodes(int index);
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies the locale of jobs to search against,
   * for example, "en-US".
   * If a value isn't specified, the search results can contain jobs in any
   * locale.
   * Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * At most 10 language code filters are allowed.
   * </pre>
   *
   * <code>repeated string language_codes = 11;</code>
   */
  com.google.protobuf.ByteString getLanguageCodesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional.
   * Jobs published within a range specified by this filter are searched
   * against.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.TimestampRange publish_time_range = 12;</code>
   */
  boolean hasPublishTimeRange();
  /**
   *
   *
   * <pre>
   * Optional.
   * Jobs published within a range specified by this filter are searched
   * against.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.TimestampRange publish_time_range = 12;</code>
   */
  com.google.cloud.talent.v4beta1.TimestampRange getPublishTimeRange();
  /**
   *
   *
   * <pre>
   * Optional.
   * Jobs published within a range specified by this filter are searched
   * against.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.TimestampRange publish_time_range = 12;</code>
   */
  com.google.cloud.talent.v4beta1.TimestampRangeOrBuilder getPublishTimeRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies a list of job names to be excluded during search.
   * At most 200 excluded job names are allowed.
   * </pre>
   *
   * <code>repeated string excluded_jobs = 13;</code>
   */
  java.util.List<java.lang.String> getExcludedJobsList();
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies a list of job names to be excluded during search.
   * At most 200 excluded job names are allowed.
   * </pre>
   *
   * <code>repeated string excluded_jobs = 13;</code>
   */
  int getExcludedJobsCount();
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies a list of job names to be excluded during search.
   * At most 200 excluded job names are allowed.
   * </pre>
   *
   * <code>repeated string excluded_jobs = 13;</code>
   */
  java.lang.String getExcludedJobs(int index);
  /**
   *
   *
   * <pre>
   * Optional.
   * This filter specifies a list of job names to be excluded during search.
   * At most 200 excluded job names are allowed.
   * </pre>
   *
   * <code>repeated string excluded_jobs = 13;</code>
   */
  com.google.protobuf.ByteString getExcludedJobsBytes(int index);
}
