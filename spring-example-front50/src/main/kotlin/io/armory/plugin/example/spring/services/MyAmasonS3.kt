package io.armory.plugin.example.spring.services

import com.amazonaws.AmazonWebServiceRequest
import com.amazonaws.HttpMethod
import com.amazonaws.regions.Region
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.S3ClientOptions
import com.amazonaws.services.s3.S3ResponseMetadata
import com.amazonaws.services.s3.model.*
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration
import com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringConfiguration
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration
import com.amazonaws.services.s3.model.ownership.OwnershipControls
import com.amazonaws.services.s3.waiters.AmazonS3Waiters
import java.io.File
import java.io.InputStream
import java.net.URL
import java.util.*

class MyAmazonS3: AmazonS3 {
    override fun putObject(putObjectRequest: PutObjectRequest?): PutObjectResult? {
        return null
    }

    override fun putObject(bucketName: String?, key: String?, file: File?): PutObjectResult? {
        return null
    }

    override fun putObject(bucketName: String?, key: String?, input: InputStream?, metadata: ObjectMetadata?): PutObjectResult? {
        return null
    }

    override fun putObject(bucketName: String?, key: String?, content: String?): PutObjectResult? {
        return null
    }

    override fun getObject(bucketName: String?, key: String?): S3Object? {
        return null
    }

    override fun getObject(getObjectRequest: GetObjectRequest?): S3Object? {
        return null
    }

    override fun getObject(getObjectRequest: GetObjectRequest?, destinationFile: File?): ObjectMetadata? {
        return null
    }

    override fun completeMultipartUpload(request: CompleteMultipartUploadRequest?): CompleteMultipartUploadResult? {
        return null
    }

    override fun initiateMultipartUpload(request: InitiateMultipartUploadRequest?): InitiateMultipartUploadResult? {
        return null
    }

    override fun uploadPart(request: UploadPartRequest?): UploadPartResult? {
        return null
    }

    override fun copyPart(copyPartRequest: CopyPartRequest?): CopyPartResult? {
        return null
    }

    override fun abortMultipartUpload(request: AbortMultipartUploadRequest?) {
    }

    override fun setEndpoint(endpoint: String?) {
    }

    override fun setRegion(region: Region?) {
    }

    override fun setS3ClientOptions(clientOptions: S3ClientOptions?) {
    }

    override fun changeObjectStorageClass(bucketName: String?, key: String?, newStorageClass: StorageClass?) {
    }

    override fun setObjectRedirectLocation(bucketName: String?, key: String?, newRedirectLocation: String?) {
    }

    override fun listObjects(bucketName: String?): ObjectListing? {
        return null
    }

    override fun listObjects(bucketName: String?, prefix: String?): ObjectListing? {
        return null
    }

    override fun listObjects(listObjectsRequest: ListObjectsRequest?): ObjectListing? {
        return null
    }

    override fun listObjectsV2(bucketName: String?): ListObjectsV2Result? {
        return null
    }

    override fun listObjectsV2(bucketName: String?, prefix: String?): ListObjectsV2Result? {
        return null
    }

    override fun listObjectsV2(listObjectsV2Request: ListObjectsV2Request?): ListObjectsV2Result? {
        return null
    }

    override fun listNextBatchOfObjects(previousObjectListing: ObjectListing?): ObjectListing? {
        return null
    }

    override fun listNextBatchOfObjects(listNextBatchOfObjectsRequest: ListNextBatchOfObjectsRequest?): ObjectListing? {
        return null
    }

    override fun listVersions(bucketName: String?, prefix: String?): VersionListing? {
        return null
    }

    override fun listVersions(bucketName: String?, prefix: String?, keyMarker: String?, versionIdMarker: String?, delimiter: String?, maxResults: Int?): VersionListing? {
        return null
    }

    override fun listVersions(listVersionsRequest: ListVersionsRequest?): VersionListing? {
        return null
    }

    override fun listNextBatchOfVersions(previousVersionListing: VersionListing?): VersionListing? {
        return null
    }

    override fun listNextBatchOfVersions(listNextBatchOfVersionsRequest: ListNextBatchOfVersionsRequest?): VersionListing? {
        return null
    }

    override fun getS3AccountOwner(): Owner? {
        return null
    }

    override fun getS3AccountOwner(getS3AccountOwnerRequest: GetS3AccountOwnerRequest?): Owner? {
        return null
    }

    override fun doesBucketExist(bucketName: String?): Boolean {
        return false
    }

    override fun doesBucketExistV2(bucketName: String?): Boolean {
        return false
    }

    override fun headBucket(headBucketRequest: HeadBucketRequest?): HeadBucketResult? {
        return null
    }

    override fun listBuckets(): List<Bucket> {
        return emptyList()
    }

    override fun listBuckets(listBucketsRequest: ListBucketsRequest?): List<Bucket> {
        return emptyList()
    }

    override fun getBucketLocation(bucketName: String?): String? {
        return null
    }

    override fun getBucketLocation(getBucketLocationRequest: GetBucketLocationRequest?): String? {
        return null
    }

    override fun createBucket(createBucketRequest: CreateBucketRequest?): Bucket? {
        return null
    }

    override fun createBucket(bucketName: String?): Bucket? {
        return null
    }

    override fun createBucket(bucketName: String?, region: com.amazonaws.services.s3.model.Region?): Bucket? {
        return null
    }

    override fun createBucket(bucketName: String?, region: String?): Bucket? {
        return null
    }

    override fun getObjectAcl(bucketName: String?, key: String?): AccessControlList? {
        return null
    }

    override fun getObjectAcl(bucketName: String?, key: String?, versionId: String?): AccessControlList? {
        return null
    }

    override fun getObjectAcl(getObjectAclRequest: GetObjectAclRequest?): AccessControlList? {
        return null
    }

    override fun setObjectAcl(bucketName: String?, key: String?, acl: AccessControlList?) {
    }

    override fun setObjectAcl(bucketName: String?, key: String?, acl: CannedAccessControlList?) {
    }

    override fun setObjectAcl(bucketName: String?, key: String?, versionId: String?, acl: AccessControlList?) {
    }

    override fun setObjectAcl(bucketName: String?, key: String?, versionId: String?, acl: CannedAccessControlList?) {
    }

    override fun setObjectAcl(setObjectAclRequest: SetObjectAclRequest?) {
    }

    override fun getBucketAcl(bucketName: String?): AccessControlList? {
        return null
    }

    override fun getBucketAcl(getBucketAclRequest: GetBucketAclRequest?): AccessControlList? {
        return null
    }

    override fun setBucketAcl(setBucketAclRequest: SetBucketAclRequest?) {
    }

    override fun setBucketAcl(bucketName: String?, acl: AccessControlList?) {
    }

    override fun setBucketAcl(bucketName: String?, acl: CannedAccessControlList?) {
    }

    override fun getObjectMetadata(bucketName: String?, key: String?): ObjectMetadata? {
        return null
    }

    override fun getObjectMetadata(getObjectMetadataRequest: GetObjectMetadataRequest?): ObjectMetadata? {
        return null
    }

    override fun getObjectAsString(bucketName: String?, key: String?): String? {
        return null
    }

    override fun getObjectTagging(getObjectTaggingRequest: GetObjectTaggingRequest?): GetObjectTaggingResult? {
        return null
    }

    override fun setObjectTagging(setObjectTaggingRequest: SetObjectTaggingRequest?): SetObjectTaggingResult ?{
        return null
    }

    override fun deleteObjectTagging(deleteObjectTaggingRequest: DeleteObjectTaggingRequest?): DeleteObjectTaggingResult? {
        return null
    }

    override fun deleteBucket(deleteBucketRequest: DeleteBucketRequest?) {
    }

    override fun deleteBucket(bucketName: String?) {
    }

    override fun copyObject(sourceBucketName: String?, sourceKey: String?, destinationBucketName: String?, destinationKey: String?): CopyObjectResult? {
        return null
    }

    override fun copyObject(copyObjectRequest: CopyObjectRequest?): CopyObjectResult? {
        return null
    }

    override fun deleteObject(bucketName: String?, key: String?) {
    }

    override fun deleteObject(deleteObjectRequest: DeleteObjectRequest?) {
    }

    override fun deleteObjects(deleteObjectsRequest: DeleteObjectsRequest?): DeleteObjectsResult? {
        return null
    }

    override fun deleteVersion(bucketName: String?, key: String?, versionId: String?) {
    }

    override fun deleteVersion(deleteVersionRequest: DeleteVersionRequest?) {
    }

    override fun getBucketLoggingConfiguration(bucketName: String?): BucketLoggingConfiguration? {
        return null
    }

    override fun getBucketLoggingConfiguration(getBucketLoggingConfigurationRequest: GetBucketLoggingConfigurationRequest?): BucketLoggingConfiguration? {
        return null
    }

    override fun setBucketLoggingConfiguration(setBucketLoggingConfigurationRequest: SetBucketLoggingConfigurationRequest?) {
    }

    override fun getBucketVersioningConfiguration(bucketName: String?): BucketVersioningConfiguration? {
        return null
    }

    override fun getBucketVersioningConfiguration(getBucketVersioningConfigurationRequest: GetBucketVersioningConfigurationRequest?): BucketVersioningConfiguration? {
        return null
    }

    override fun setBucketVersioningConfiguration(setBucketVersioningConfigurationRequest: SetBucketVersioningConfigurationRequest?) {
    }

    override fun getBucketLifecycleConfiguration(bucketName: String?): BucketLifecycleConfiguration? {
        return null
    }

    override fun getBucketLifecycleConfiguration(getBucketLifecycleConfigurationRequest: GetBucketLifecycleConfigurationRequest?): BucketLifecycleConfiguration? {
        return null
    }

    override fun setBucketLifecycleConfiguration(bucketName: String?, bucketLifecycleConfiguration: BucketLifecycleConfiguration?) {
    }

    override fun setBucketLifecycleConfiguration(setBucketLifecycleConfigurationRequest: SetBucketLifecycleConfigurationRequest?) {
    }

    override fun deleteBucketLifecycleConfiguration(bucketName: String?) {
    }

    override fun deleteBucketLifecycleConfiguration(deleteBucketLifecycleConfigurationRequest: DeleteBucketLifecycleConfigurationRequest?) {
    }

    override fun getBucketCrossOriginConfiguration(bucketName: String?): BucketCrossOriginConfiguration? {
        return null
    }

    override fun getBucketCrossOriginConfiguration(getBucketCrossOriginConfigurationRequest: GetBucketCrossOriginConfigurationRequest?): BucketCrossOriginConfiguration? {
        return null
    }

    override fun setBucketCrossOriginConfiguration(bucketName: String?, bucketCrossOriginConfiguration: BucketCrossOriginConfiguration?) {
    }

    override fun setBucketCrossOriginConfiguration(setBucketCrossOriginConfigurationRequest: SetBucketCrossOriginConfigurationRequest?) {
    }

    override fun deleteBucketCrossOriginConfiguration(bucketName: String?) {
    }

    override fun deleteBucketCrossOriginConfiguration(deleteBucketCrossOriginConfigurationRequest: DeleteBucketCrossOriginConfigurationRequest?) {
    }

    override fun getBucketTaggingConfiguration(bucketName: String?): BucketTaggingConfiguration? {
        return null
    }

    override fun getBucketTaggingConfiguration(getBucketTaggingConfigurationRequest: GetBucketTaggingConfigurationRequest?): BucketTaggingConfiguration? {
        return null
    }

    override fun setBucketTaggingConfiguration(bucketName: String?, bucketTaggingConfiguration: BucketTaggingConfiguration?) {
    }

    override fun setBucketTaggingConfiguration(setBucketTaggingConfigurationRequest: SetBucketTaggingConfigurationRequest?) {
    }

    override fun deleteBucketTaggingConfiguration(bucketName: String?) {
    }

    override fun deleteBucketTaggingConfiguration(deleteBucketTaggingConfigurationRequest: DeleteBucketTaggingConfigurationRequest?) {
    }

    override fun getBucketNotificationConfiguration(bucketName: String?): BucketNotificationConfiguration? {
        return null
    }

    override fun getBucketNotificationConfiguration(getBucketNotificationConfigurationRequest: GetBucketNotificationConfigurationRequest?): BucketNotificationConfiguration? {
        return null
    }

    override fun setBucketNotificationConfiguration(setBucketNotificationConfigurationRequest: SetBucketNotificationConfigurationRequest?) {
    }

    override fun setBucketNotificationConfiguration(bucketName: String?, bucketNotificationConfiguration: BucketNotificationConfiguration?) {
    }

    override fun getBucketWebsiteConfiguration(bucketName: String?): BucketWebsiteConfiguration? {
        return null
    }

    override fun getBucketWebsiteConfiguration(getBucketWebsiteConfigurationRequest: GetBucketWebsiteConfigurationRequest?): BucketWebsiteConfiguration? {
        return null
    }

    override fun setBucketWebsiteConfiguration(bucketName: String?, configuration: BucketWebsiteConfiguration?) {
    }

    override fun setBucketWebsiteConfiguration(setBucketWebsiteConfigurationRequest: SetBucketWebsiteConfigurationRequest?) {
    }

    override fun deleteBucketWebsiteConfiguration(bucketName: String?) {
    }

    override fun deleteBucketWebsiteConfiguration(deleteBucketWebsiteConfigurationRequest: DeleteBucketWebsiteConfigurationRequest?) {
    }

    override fun getBucketPolicy(bucketName: String?): BucketPolicy? {
        return null
    }

    override fun getBucketPolicy(getBucketPolicyRequest: GetBucketPolicyRequest?): BucketPolicy? {
        return null
    }

    override fun setBucketPolicy(bucketName: String?, policyText: String?) {
    }

    override fun setBucketPolicy(setBucketPolicyRequest: SetBucketPolicyRequest?) {
    }

    override fun deleteBucketPolicy(bucketName: String?) {
    }

    override fun deleteBucketPolicy(deleteBucketPolicyRequest: DeleteBucketPolicyRequest?) {
    }

    override fun generatePresignedUrl(bucketName: String?, key: String?, expiration: Date?): URL? {
        return null
    }

    override fun generatePresignedUrl(bucketName: String?, key: String?, expiration: Date?, method: HttpMethod?): URL? {
        return null
    }

    override fun generatePresignedUrl(generatePresignedUrlRequest: GeneratePresignedUrlRequest?): URL? {
        return null
    }

    override fun listParts(request: ListPartsRequest?): PartListing? {
        return null
    }

    override fun listMultipartUploads(request: ListMultipartUploadsRequest?): MultipartUploadListing? {
        return null
    }

    override fun getCachedResponseMetadata(request: AmazonWebServiceRequest?): S3ResponseMetadata? {
        return null
    }

    override fun restoreObject(request: RestoreObjectRequest?) {
    }

    override fun restoreObject(bucketName: String?, key: String?, expirationInDays: Int) {
    }

    override fun restoreObjectV2(request: RestoreObjectRequest?): RestoreObjectResult? {
        return null
    }

    override fun enableRequesterPays(bucketName: String?) {
    }

    override fun disableRequesterPays(bucketName: String?) {
    }

    override fun isRequesterPaysEnabled(bucketName: String?): Boolean {
        return false
    }

    override fun setRequestPaymentConfiguration(setRequestPaymentConfigurationRequest: SetRequestPaymentConfigurationRequest?) {
    }

    override fun setBucketReplicationConfiguration(bucketName: String?, configuration: BucketReplicationConfiguration?) {
    }

    override fun setBucketReplicationConfiguration(setBucketReplicationConfigurationRequest: SetBucketReplicationConfigurationRequest?) {
    }

    override fun getBucketReplicationConfiguration(bucketName: String?): BucketReplicationConfiguration? {
        return null
    }

    override fun getBucketReplicationConfiguration(getBucketReplicationConfigurationRequest: GetBucketReplicationConfigurationRequest?): BucketReplicationConfiguration? {
        return null
    }

    override fun deleteBucketReplicationConfiguration(bucketName: String?) {
    }

    override fun deleteBucketReplicationConfiguration(request: DeleteBucketReplicationConfigurationRequest?) {
    }

    override fun doesObjectExist(bucketName: String?, objectName: String?): Boolean {
        return false
    }

    override fun getBucketAccelerateConfiguration(bucketName: String?): BucketAccelerateConfiguration? {
        return null
    }

    override fun getBucketAccelerateConfiguration(getBucketAccelerateConfigurationRequest: GetBucketAccelerateConfigurationRequest?): BucketAccelerateConfiguration? {
        return null
    }

    override fun setBucketAccelerateConfiguration(bucketName: String?, accelerateConfiguration: BucketAccelerateConfiguration?) {
    }

    override fun setBucketAccelerateConfiguration(setBucketAccelerateConfigurationRequest: SetBucketAccelerateConfigurationRequest?) {
    }

    override fun deleteBucketMetricsConfiguration(bucketName: String?, id: String?): DeleteBucketMetricsConfigurationResult? {
        return null
    }

    override fun deleteBucketMetricsConfiguration(deleteBucketMetricsConfigurationRequest: DeleteBucketMetricsConfigurationRequest?): DeleteBucketMetricsConfigurationResult? {
        return null
    }

    override fun getBucketMetricsConfiguration(bucketName: String?, id: String?): GetBucketMetricsConfigurationResult? {
        return null
    }

    override fun getBucketMetricsConfiguration(getBucketMetricsConfigurationRequest: GetBucketMetricsConfigurationRequest?): GetBucketMetricsConfigurationResult? {
        return null
    }

    override fun setBucketMetricsConfiguration(bucketName: String?, metricsConfiguration: MetricsConfiguration?): SetBucketMetricsConfigurationResult? {
        return null
    }

    override fun setBucketMetricsConfiguration(setBucketMetricsConfigurationRequest: SetBucketMetricsConfigurationRequest?): SetBucketMetricsConfigurationResult? {
        return null
    }

    override fun listBucketMetricsConfigurations(listBucketMetricsConfigurationsRequest: ListBucketMetricsConfigurationsRequest?): ListBucketMetricsConfigurationsResult? {
        return null
    }

    override fun deleteBucketOwnershipControls(deleteBucketOwnershipControlsRequest: DeleteBucketOwnershipControlsRequest?): DeleteBucketOwnershipControlsResult? {
        return null
    }

    override fun getBucketOwnershipControls(getBucketOwnershipControlsRequest: GetBucketOwnershipControlsRequest?): GetBucketOwnershipControlsResult? {
        return null
    }

    override fun setBucketOwnershipControls(bucketName: String?, ownershipControls: OwnershipControls?): SetBucketOwnershipControlsResult? {
        return null
    }

    override fun setBucketOwnershipControls(setBucketOwnershipControlsRequest: SetBucketOwnershipControlsRequest?): SetBucketOwnershipControlsResult? {
        return null
    }

    override fun deleteBucketAnalyticsConfiguration(bucketName: String?, id: String?): DeleteBucketAnalyticsConfigurationResult? {
        return null
    }

    override fun deleteBucketAnalyticsConfiguration(deleteBucketAnalyticsConfigurationRequest: DeleteBucketAnalyticsConfigurationRequest?): DeleteBucketAnalyticsConfigurationResult? {
        return null
    }

    override fun getBucketAnalyticsConfiguration(bucketName: String?, id: String?): GetBucketAnalyticsConfigurationResult? {
        return null
    }

    override fun getBucketAnalyticsConfiguration(getBucketAnalyticsConfigurationRequest: GetBucketAnalyticsConfigurationRequest?): GetBucketAnalyticsConfigurationResult? {
        return null
    }

    override fun setBucketAnalyticsConfiguration(bucketName: String?, analyticsConfiguration: AnalyticsConfiguration?): SetBucketAnalyticsConfigurationResult? {
        return null
    }

    override fun setBucketAnalyticsConfiguration(setBucketAnalyticsConfigurationRequest: SetBucketAnalyticsConfigurationRequest?): SetBucketAnalyticsConfigurationResult? {
        return null
    }

    override fun listBucketAnalyticsConfigurations(listBucketAnalyticsConfigurationsRequest: ListBucketAnalyticsConfigurationsRequest?): ListBucketAnalyticsConfigurationsResult? {
        return null
    }

    override fun deleteBucketIntelligentTieringConfiguration(bucketName: String?, id: String?): DeleteBucketIntelligentTieringConfigurationResult? {
        return null
    }

    override fun deleteBucketIntelligentTieringConfiguration(deleteBucketIntelligentTieringConfigurationRequest: DeleteBucketIntelligentTieringConfigurationRequest?): DeleteBucketIntelligentTieringConfigurationResult? {
        return null
    }

    override fun getBucketIntelligentTieringConfiguration(bucketName: String?, id: String?): GetBucketIntelligentTieringConfigurationResult? {
        return null
    }

    override fun getBucketIntelligentTieringConfiguration(getBucketIntelligentTieringConfigurationRequest: GetBucketIntelligentTieringConfigurationRequest?): GetBucketIntelligentTieringConfigurationResult? {
        return null
    }

    override fun setBucketIntelligentTieringConfiguration(bucketName: String?, intelligentTieringConfiguration: IntelligentTieringConfiguration?): SetBucketIntelligentTieringConfigurationResult? {
        return null
    }

    override fun setBucketIntelligentTieringConfiguration(setBucketIntelligentTieringConfigurationRequest: SetBucketIntelligentTieringConfigurationRequest?): SetBucketIntelligentTieringConfigurationResult? {
        return null
    }

    override fun listBucketIntelligentTieringConfigurations(listBucketIntelligentTieringConfigurationsRequest: ListBucketIntelligentTieringConfigurationsRequest?): ListBucketIntelligentTieringConfigurationsResult? {
        return null
    }

    override fun deleteBucketInventoryConfiguration(bucketName: String?, id: String?): DeleteBucketInventoryConfigurationResult? {
        return null
    }

    override fun deleteBucketInventoryConfiguration(deleteBucketInventoryConfigurationRequest: DeleteBucketInventoryConfigurationRequest?): DeleteBucketInventoryConfigurationResult? {
        return null
    }

    override fun getBucketInventoryConfiguration(bucketName: String?, id: String?): GetBucketInventoryConfigurationResult? {
        return null
    }

    override fun getBucketInventoryConfiguration(getBucketInventoryConfigurationRequest: GetBucketInventoryConfigurationRequest?): GetBucketInventoryConfigurationResult? {
        return null
    }

    override fun setBucketInventoryConfiguration(bucketName: String?, inventoryConfiguration: InventoryConfiguration?): SetBucketInventoryConfigurationResult? {
        return null
    }

    override fun setBucketInventoryConfiguration(setBucketInventoryConfigurationRequest: SetBucketInventoryConfigurationRequest?): SetBucketInventoryConfigurationResult? {
        return null
    }

    override fun listBucketInventoryConfigurations(listBucketInventoryConfigurationsRequest: ListBucketInventoryConfigurationsRequest?): ListBucketInventoryConfigurationsResult? {
        return null
    }

    override fun deleteBucketEncryption(bucketName: String?): DeleteBucketEncryptionResult? {
        return null
    }

    override fun deleteBucketEncryption(request: DeleteBucketEncryptionRequest?): DeleteBucketEncryptionResult? {
        return null
    }

    override fun getBucketEncryption(bucketName: String?): GetBucketEncryptionResult? {
        return null
    }

    override fun getBucketEncryption(request: GetBucketEncryptionRequest?): GetBucketEncryptionResult? {
        return null
    }

    override fun setBucketEncryption(setBucketEncryptionRequest: SetBucketEncryptionRequest?): SetBucketEncryptionResult? {
        return null
    }

    override fun setPublicAccessBlock(request: SetPublicAccessBlockRequest?): SetPublicAccessBlockResult? {
        return null
    }

    override fun getPublicAccessBlock(request: GetPublicAccessBlockRequest?): GetPublicAccessBlockResult? {
        return null
    }

    override fun deletePublicAccessBlock(request: DeletePublicAccessBlockRequest?): DeletePublicAccessBlockResult? {
        return null
    }

    override fun getBucketPolicyStatus(request: GetBucketPolicyStatusRequest?): GetBucketPolicyStatusResult? {
        return null
    }

    override fun selectObjectContent(selectRequest: SelectObjectContentRequest?): SelectObjectContentResult? {
        return null
    }

    override fun setObjectLegalHold(setObjectLegalHoldRequest: SetObjectLegalHoldRequest?): SetObjectLegalHoldResult? {
        return null
    }

    override fun getObjectLegalHold(getObjectLegalHoldRequest: GetObjectLegalHoldRequest?): GetObjectLegalHoldResult? {
        return null
    }

    override fun setObjectLockConfiguration(setObjectLockConfigurationRequest: SetObjectLockConfigurationRequest?): SetObjectLockConfigurationResult? {
        return null
    }

    override fun getObjectLockConfiguration(getObjectLockConfigurationRequest: GetObjectLockConfigurationRequest?): GetObjectLockConfigurationResult? {
        return null
    }

    override fun setObjectRetention(setObjectRetentionRequest: SetObjectRetentionRequest?): SetObjectRetentionResult? {
        return null
    }

    override fun getObjectRetention(getObjectRetentionRequest: GetObjectRetentionRequest?): GetObjectRetentionResult? {
        return null
    }

    override fun download(presignedUrlDownloadRequest: PresignedUrlDownloadRequest?): PresignedUrlDownloadResult? {
        return null
    }

    override fun download(presignedUrlDownloadRequest: PresignedUrlDownloadRequest?, destinationFile: File?) {
    }

    override fun upload(presignedUrlUploadRequest: PresignedUrlUploadRequest?): PresignedUrlUploadResult? {
        return null
    }

    override fun shutdown() {
    }

    override fun getRegion(): com.amazonaws.services.s3.model.Region? {
        return null
    }

    override fun getRegionName(): String? {
        return null
    }

    override fun getUrl(bucketName: String?, key: String?): URL? {
        return null
    }

    override fun waiters(): AmazonS3Waiters? {
        return null
    }

}
