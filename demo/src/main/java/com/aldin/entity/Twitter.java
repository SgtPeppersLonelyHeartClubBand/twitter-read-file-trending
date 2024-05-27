package com.aldin.entity;


import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Twitter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String objectType;
    private String verb;
    private String postedTime;
    private String generatorDisplayName;
    private String generatorLink;
    private String providerObjectType;
    private String providerDisplayName;
    private String providerLink;
    private String link;
    private String body;
    private String actorObjectType;
    private String actorId;
    private String actorLink;
    private String actorDisplayName;
    private String actorPostedTime;
    private String actorImage;
    private String actorSummary;
    private int actorFriendsCount;
    private int actorFollowersCount;
    private int actorListedCount;
    private int actorStatusesCount;
    private String actorTwitterTimeZone;
    private boolean actorVerified;
    private String actorUtcOffset;
    private String actorPreferredUsername;
    private int actorFavoritesCount;
    private String objectObjectType;
    private String objectId;
    private String objectSummary;
    private String objectLink;
    private String objectPostedTime;
    private String inReplyToLink;
    private int favoritesCount;
    private String twitterLang;
    private int retweetCount;
    private String twitterFilterLevel;
    private String conversation;
    

    public String getConversation() {
		return conversation;
	}

	public void setConversation(String conversation) {
		this.conversation = conversation;
	}

	@ElementCollection
    private List<String> hashtags;

    @ElementCollection
    private List<String> urls;

    @ElementCollection
    private List<String> userMentions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public String getPostedTime() {
		return postedTime;
	}

	public void setPostedTime(String postedTime) {
		this.postedTime = postedTime;
	}

	public String getGeneratorDisplayName() {
		return generatorDisplayName;
	}

	public void setGeneratorDisplayName(String generatorDisplayName) {
		this.generatorDisplayName = generatorDisplayName;
	}

	public String getGeneratorLink() {
		return generatorLink;
	}

	public void setGeneratorLink(String generatorLink) {
		this.generatorLink = generatorLink;
	}

	public String getProviderObjectType() {
		return providerObjectType;
	}

	public void setProviderObjectType(String providerObjectType) {
		this.providerObjectType = providerObjectType;
	}

	public String getProviderDisplayName() {
		return providerDisplayName;
	}

	public void setProviderDisplayName(String providerDisplayName) {
		this.providerDisplayName = providerDisplayName;
	}

	public String getProviderLink() {
		return providerLink;
	}

	public void setProviderLink(String providerLink) {
		this.providerLink = providerLink;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getActorObjectType() {
		return actorObjectType;
	}

	public void setActorObjectType(String actorObjectType) {
		this.actorObjectType = actorObjectType;
	}

	public String getActorId() {
		return actorId;
	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	public String getActorLink() {
		return actorLink;
	}

	public void setActorLink(String actorLink) {
		this.actorLink = actorLink;
	}

	public String getActorDisplayName() {
		return actorDisplayName;
	}

	public void setActorDisplayName(String actorDisplayName) {
		this.actorDisplayName = actorDisplayName;
	}

	public String getActorPostedTime() {
		return actorPostedTime;
	}

	public void setActorPostedTime(String actorPostedTime) {
		this.actorPostedTime = actorPostedTime;
	}

	public String getActorImage() {
		return actorImage;
	}

	public void setActorImage(String actorImage) {
		this.actorImage = actorImage;
	}

	public String getActorSummary() {
		return actorSummary;
	}

	public void setActorSummary(String actorSummary) {
		this.actorSummary = actorSummary;
	}

	public int getActorFriendsCount() {
		return actorFriendsCount;
	}

	public void setActorFriendsCount(int actorFriendsCount) {
		this.actorFriendsCount = actorFriendsCount;
	}

	public int getActorFollowersCount() {
		return actorFollowersCount;
	}

	public void setActorFollowersCount(int actorFollowersCount) {
		this.actorFollowersCount = actorFollowersCount;
	}

	public int getActorListedCount() {
		return actorListedCount;
	}

	public void setActorListedCount(int actorListedCount) {
		this.actorListedCount = actorListedCount;
	}

	public int getActorStatusesCount() {
		return actorStatusesCount;
	}

	public void setActorStatusesCount(int actorStatusesCount) {
		this.actorStatusesCount = actorStatusesCount;
	}

	public String getActorTwitterTimeZone() {
		return actorTwitterTimeZone;
	}

	public void setActorTwitterTimeZone(String actorTwitterTimeZone) {
		this.actorTwitterTimeZone = actorTwitterTimeZone;
	}

	public boolean isActorVerified() {
		return actorVerified;
	}

	public void setActorVerified(boolean actorVerified) {
		this.actorVerified = actorVerified;
	}

	public String getActorUtcOffset() {
		return actorUtcOffset;
	}

	public void setActorUtcOffset(String actorUtcOffset) {
		this.actorUtcOffset = actorUtcOffset;
	}

	public String getActorPreferredUsername() {
		return actorPreferredUsername;
	}

	public void setActorPreferredUsername(String actorPreferredUsername) {
		this.actorPreferredUsername = actorPreferredUsername;
	}

	public int getActorFavoritesCount() {
		return actorFavoritesCount;
	}

	public void setActorFavoritesCount(int actorFavoritesCount) {
		this.actorFavoritesCount = actorFavoritesCount;
	}

	public String getObjectObjectType() {
		return objectObjectType;
	}

	public void setObjectObjectType(String objectObjectType) {
		this.objectObjectType = objectObjectType;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getObjectSummary() {
		return objectSummary;
	}

	public void setObjectSummary(String objectSummary) {
		this.objectSummary = objectSummary;
	}

	public String getObjectLink() {
		return objectLink;
	}

	public void setObjectLink(String objectLink) {
		this.objectLink = objectLink;
	}

	public String getObjectPostedTime() {
		return objectPostedTime;
	}

	public void setObjectPostedTime(String objectPostedTime) {
		this.objectPostedTime = objectPostedTime;
	}

	public String getInReplyToLink() {
		return inReplyToLink;
	}

	public void setInReplyToLink(String inReplyToLink) {
		this.inReplyToLink = inReplyToLink;
	}

	public int getFavoritesCount() {
		return favoritesCount;
	}

	public void setFavoritesCount(int favoritesCount) {
		this.favoritesCount = favoritesCount;
	}

	public String getTwitterLang() {
		return twitterLang;
	}

	public void setTwitterLang(String twitterLang) {
		this.twitterLang = twitterLang;
	}

	public int getRetweetCount() {
		return retweetCount;
	}

	public void setRetweetCount(int retweetCount) {
		this.retweetCount = retweetCount;
	}

	public String getTwitterFilterLevel() {
		return twitterFilterLevel;
	}

	public void setTwitterFilterLevel(String twitterFilterLevel) {
		this.twitterFilterLevel = twitterFilterLevel;
	}

	public List<String> getHashtags() {
		return hashtags;
	}

	public void setHashtags(List<String> hashtags) {
		this.hashtags = hashtags;
	}

	public List<String> getUrls() {
		return urls;
	}

	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	public List<String> getUserMentions() {
		return userMentions;
	}

	public void setUserMentions(List<String> userMentions) {
		this.userMentions = userMentions;
	}

    
    
}