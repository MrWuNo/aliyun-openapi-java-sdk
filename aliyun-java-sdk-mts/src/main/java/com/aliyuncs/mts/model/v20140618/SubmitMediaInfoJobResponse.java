/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.SubmitMediaInfoJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SubmitMediaInfoJobResponse extends AcsResponse {

	private String requestId;

	private MediaInfoJob mediaInfoJob;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MediaInfoJob getMediaInfoJob() {
		return this.mediaInfoJob;
	}

	public void setMediaInfoJob(MediaInfoJob mediaInfoJob) {
		this.mediaInfoJob = mediaInfoJob;
	}

	public static class MediaInfoJob {

		private String jobId;

		private String userData;

		private String pipelineId;

		private Boolean async;

		private String state;

		private String code;

		private String message;

		private String creationTime;

		private Input input;

		private Properties properties;

		private MNSMessageResult mNSMessageResult;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public Boolean getAsync() {
			return this.async;
		}

		public void setAsync(Boolean async) {
			this.async = async;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public Properties getProperties() {
			return this.properties;
		}

		public void setProperties(Properties properties) {
			this.properties = properties;
		}

		public MNSMessageResult getMNSMessageResult() {
			return this.mNSMessageResult;
		}

		public void setMNSMessageResult(MNSMessageResult mNSMessageResult) {
			this.mNSMessageResult = mNSMessageResult;
		}

		public static class Input {

			private String bucket;

			private String location;

			private String object;

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getObject() {
				return this.object;
			}

			public void setObject(String object) {
				this.object = object;
			}
		}

		public static class Properties {

			private String width;

			private String height;

			private String bitrate;

			private String duration;

			private String fps;

			private String fileSize;

			private String fileFormat;

			private Streams streams;

			private Format format;

			public String getWidth() {
				return this.width;
			}

			public void setWidth(String width) {
				this.width = width;
			}

			public String getHeight() {
				return this.height;
			}

			public void setHeight(String height) {
				this.height = height;
			}

			public String getBitrate() {
				return this.bitrate;
			}

			public void setBitrate(String bitrate) {
				this.bitrate = bitrate;
			}

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}

			public String getFps() {
				return this.fps;
			}

			public void setFps(String fps) {
				this.fps = fps;
			}

			public String getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(String fileSize) {
				this.fileSize = fileSize;
			}

			public String getFileFormat() {
				return this.fileFormat;
			}

			public void setFileFormat(String fileFormat) {
				this.fileFormat = fileFormat;
			}

			public Streams getStreams() {
				return this.streams;
			}

			public void setStreams(Streams streams) {
				this.streams = streams;
			}

			public Format getFormat() {
				return this.format;
			}

			public void setFormat(Format format) {
				this.format = format;
			}

			public static class Streams {

				private List<VideoStream> videoStreamList;

				private List<AudioStream> audioStreamList;

				private List<SubtitleStream> subtitleStreamList;

				public List<VideoStream> getVideoStreamList() {
					return this.videoStreamList;
				}

				public void setVideoStreamList(List<VideoStream> videoStreamList) {
					this.videoStreamList = videoStreamList;
				}

				public List<AudioStream> getAudioStreamList() {
					return this.audioStreamList;
				}

				public void setAudioStreamList(List<AudioStream> audioStreamList) {
					this.audioStreamList = audioStreamList;
				}

				public List<SubtitleStream> getSubtitleStreamList() {
					return this.subtitleStreamList;
				}

				public void setSubtitleStreamList(List<SubtitleStream> subtitleStreamList) {
					this.subtitleStreamList = subtitleStreamList;
				}

				public static class VideoStream {

					private String index;

					private String codecName;

					private String codecLongName;

					private String profile;

					private String codecTimeBase;

					private String codecTagString;

					private String codecTag;

					private String width;

					private String height;

					private String hasBFrames;

					private String sar;

					private String dar;

					private String pixFmt;

					private String level;

					private String fps;

					private String avgFPS;

					private String timebase;

					private String startTime;

					private String duration;

					private String bitrate;

					private String numFrames;

					private String lang;

					private String rotate;

					private NetworkCost networkCost;

					public String getIndex() {
						return this.index;
					}

					public void setIndex(String index) {
						this.index = index;
					}

					public String getCodecName() {
						return this.codecName;
					}

					public void setCodecName(String codecName) {
						this.codecName = codecName;
					}

					public String getCodecLongName() {
						return this.codecLongName;
					}

					public void setCodecLongName(String codecLongName) {
						this.codecLongName = codecLongName;
					}

					public String getProfile() {
						return this.profile;
					}

					public void setProfile(String profile) {
						this.profile = profile;
					}

					public String getCodecTimeBase() {
						return this.codecTimeBase;
					}

					public void setCodecTimeBase(String codecTimeBase) {
						this.codecTimeBase = codecTimeBase;
					}

					public String getCodecTagString() {
						return this.codecTagString;
					}

					public void setCodecTagString(String codecTagString) {
						this.codecTagString = codecTagString;
					}

					public String getCodecTag() {
						return this.codecTag;
					}

					public void setCodecTag(String codecTag) {
						this.codecTag = codecTag;
					}

					public String getWidth() {
						return this.width;
					}

					public void setWidth(String width) {
						this.width = width;
					}

					public String getHeight() {
						return this.height;
					}

					public void setHeight(String height) {
						this.height = height;
					}

					public String getHasBFrames() {
						return this.hasBFrames;
					}

					public void setHasBFrames(String hasBFrames) {
						this.hasBFrames = hasBFrames;
					}

					public String getSar() {
						return this.sar;
					}

					public void setSar(String sar) {
						this.sar = sar;
					}

					public String getDar() {
						return this.dar;
					}

					public void setDar(String dar) {
						this.dar = dar;
					}

					public String getPixFmt() {
						return this.pixFmt;
					}

					public void setPixFmt(String pixFmt) {
						this.pixFmt = pixFmt;
					}

					public String getLevel() {
						return this.level;
					}

					public void setLevel(String level) {
						this.level = level;
					}

					public String getFps() {
						return this.fps;
					}

					public void setFps(String fps) {
						this.fps = fps;
					}

					public String getAvgFPS() {
						return this.avgFPS;
					}

					public void setAvgFPS(String avgFPS) {
						this.avgFPS = avgFPS;
					}

					public String getTimebase() {
						return this.timebase;
					}

					public void setTimebase(String timebase) {
						this.timebase = timebase;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getDuration() {
						return this.duration;
					}

					public void setDuration(String duration) {
						this.duration = duration;
					}

					public String getBitrate() {
						return this.bitrate;
					}

					public void setBitrate(String bitrate) {
						this.bitrate = bitrate;
					}

					public String getNumFrames() {
						return this.numFrames;
					}

					public void setNumFrames(String numFrames) {
						this.numFrames = numFrames;
					}

					public String getLang() {
						return this.lang;
					}

					public void setLang(String lang) {
						this.lang = lang;
					}

					public String getRotate() {
						return this.rotate;
					}

					public void setRotate(String rotate) {
						this.rotate = rotate;
					}

					public NetworkCost getNetworkCost() {
						return this.networkCost;
					}

					public void setNetworkCost(NetworkCost networkCost) {
						this.networkCost = networkCost;
					}

					public static class NetworkCost {

						private String preloadTime;

						private String costBandwidth;

						private String avgBitrate;

						public String getPreloadTime() {
							return this.preloadTime;
						}

						public void setPreloadTime(String preloadTime) {
							this.preloadTime = preloadTime;
						}

						public String getCostBandwidth() {
							return this.costBandwidth;
						}

						public void setCostBandwidth(String costBandwidth) {
							this.costBandwidth = costBandwidth;
						}

						public String getAvgBitrate() {
							return this.avgBitrate;
						}

						public void setAvgBitrate(String avgBitrate) {
							this.avgBitrate = avgBitrate;
						}
					}
				}

				public static class AudioStream {

					private String index;

					private String codecName;

					private String codecTimeBase;

					private String codecLongName;

					private String codecTagString;

					private String codecTag;

					private String sampleFmt;

					private String samplerate;

					private String channels;

					private String channelLayout;

					private String timebase;

					private String startTime;

					private String duration;

					private String bitrate;

					private String numFrames;

					private String lang;

					public String getIndex() {
						return this.index;
					}

					public void setIndex(String index) {
						this.index = index;
					}

					public String getCodecName() {
						return this.codecName;
					}

					public void setCodecName(String codecName) {
						this.codecName = codecName;
					}

					public String getCodecTimeBase() {
						return this.codecTimeBase;
					}

					public void setCodecTimeBase(String codecTimeBase) {
						this.codecTimeBase = codecTimeBase;
					}

					public String getCodecLongName() {
						return this.codecLongName;
					}

					public void setCodecLongName(String codecLongName) {
						this.codecLongName = codecLongName;
					}

					public String getCodecTagString() {
						return this.codecTagString;
					}

					public void setCodecTagString(String codecTagString) {
						this.codecTagString = codecTagString;
					}

					public String getCodecTag() {
						return this.codecTag;
					}

					public void setCodecTag(String codecTag) {
						this.codecTag = codecTag;
					}

					public String getSampleFmt() {
						return this.sampleFmt;
					}

					public void setSampleFmt(String sampleFmt) {
						this.sampleFmt = sampleFmt;
					}

					public String getSamplerate() {
						return this.samplerate;
					}

					public void setSamplerate(String samplerate) {
						this.samplerate = samplerate;
					}

					public String getChannels() {
						return this.channels;
					}

					public void setChannels(String channels) {
						this.channels = channels;
					}

					public String getChannelLayout() {
						return this.channelLayout;
					}

					public void setChannelLayout(String channelLayout) {
						this.channelLayout = channelLayout;
					}

					public String getTimebase() {
						return this.timebase;
					}

					public void setTimebase(String timebase) {
						this.timebase = timebase;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getDuration() {
						return this.duration;
					}

					public void setDuration(String duration) {
						this.duration = duration;
					}

					public String getBitrate() {
						return this.bitrate;
					}

					public void setBitrate(String bitrate) {
						this.bitrate = bitrate;
					}

					public String getNumFrames() {
						return this.numFrames;
					}

					public void setNumFrames(String numFrames) {
						this.numFrames = numFrames;
					}

					public String getLang() {
						return this.lang;
					}

					public void setLang(String lang) {
						this.lang = lang;
					}
				}

				public static class SubtitleStream {

					private String index;

					private String codecName;

					private String codecTimeBase;

					private String codecLongName;

					private String codecTagString;

					private String codecTag;

					private String timebase;

					private String startTime;

					private String duration;

					private String lang;

					public String getIndex() {
						return this.index;
					}

					public void setIndex(String index) {
						this.index = index;
					}

					public String getCodecName() {
						return this.codecName;
					}

					public void setCodecName(String codecName) {
						this.codecName = codecName;
					}

					public String getCodecTimeBase() {
						return this.codecTimeBase;
					}

					public void setCodecTimeBase(String codecTimeBase) {
						this.codecTimeBase = codecTimeBase;
					}

					public String getCodecLongName() {
						return this.codecLongName;
					}

					public void setCodecLongName(String codecLongName) {
						this.codecLongName = codecLongName;
					}

					public String getCodecTagString() {
						return this.codecTagString;
					}

					public void setCodecTagString(String codecTagString) {
						this.codecTagString = codecTagString;
					}

					public String getCodecTag() {
						return this.codecTag;
					}

					public void setCodecTag(String codecTag) {
						this.codecTag = codecTag;
					}

					public String getTimebase() {
						return this.timebase;
					}

					public void setTimebase(String timebase) {
						this.timebase = timebase;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getDuration() {
						return this.duration;
					}

					public void setDuration(String duration) {
						this.duration = duration;
					}

					public String getLang() {
						return this.lang;
					}

					public void setLang(String lang) {
						this.lang = lang;
					}
				}
			}

			public static class Format {

				private String numStreams;

				private String numPrograms;

				private String formatName;

				private String formatLongName;

				private String startTime;

				private String duration;

				private String size;

				private String bitrate;

				public String getNumStreams() {
					return this.numStreams;
				}

				public void setNumStreams(String numStreams) {
					this.numStreams = numStreams;
				}

				public String getNumPrograms() {
					return this.numPrograms;
				}

				public void setNumPrograms(String numPrograms) {
					this.numPrograms = numPrograms;
				}

				public String getFormatName() {
					return this.formatName;
				}

				public void setFormatName(String formatName) {
					this.formatName = formatName;
				}

				public String getFormatLongName() {
					return this.formatLongName;
				}

				public void setFormatLongName(String formatLongName) {
					this.formatLongName = formatLongName;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getSize() {
					return this.size;
				}

				public void setSize(String size) {
					this.size = size;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}
			}
		}

		public static class MNSMessageResult {

			private String messageId;

			private String errorMessage;

			private String errorCode;

			public String getMessageId() {
				return this.messageId;
			}

			public void setMessageId(String messageId) {
				this.messageId = messageId;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}
		}
	}

	@Override
	public SubmitMediaInfoJobResponse getInstance(UnmarshallerContext context) {
		return	SubmitMediaInfoJobResponseUnmarshaller.unmarshall(this, context);
	}
}
