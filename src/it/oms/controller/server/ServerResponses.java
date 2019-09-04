package it.oms.controller.server;

import java.util.List;

public class ServerResponses {
	
	protected class ServerAvaiability implements ServerResponse {
		private final boolean isAvaiable;
		// TODO move logic of owner and address in MODEL
		private final String owner;
		private final String ownerAddress;
		
		public ServerAvaiability (final boolean isAvaiable, final String owner, final String ownerAddress) {
			this.isAvaiable = isAvaiable;
			this.owner = owner;
			this.ownerAddress = ownerAddress;
		}

		public boolean isAvaiable() {
			return isAvaiable;
		}

		public String getOwner() {
			return owner;
		}

		public String getOwnerAddress() {
			return ownerAddress;
		}

		@Override
		public String toJson() {
			// TODO format json of ServerAvaiability!
			if (isAvaiable()) {
				return "";
			} else {
				return "";
			}
		}		
	}
	
	protected class AckServerOpeningAvaiability implements ServerResponse {

		private final boolean isOpeningAvaiable;
		private final List<String> pathsToFiles;
		private final KeepAliveService keepAliveService;
		
		public AckServerOpeningAvaiability(final boolean isOpeningAvaiable, final List<String> pathsToFiles, final KeepAliveService keepAliveService) {
			this.isOpeningAvaiable = isOpeningAvaiable;
			this.pathsToFiles = pathsToFiles;
			this.keepAliveService = keepAliveService;
		}

		public boolean isOpeningAvaiable() {
			return this.isOpeningAvaiable;
		}
		
		public List<String> getPathToFiles() {
			return this.pathsToFiles;
		}

		public KeepAliveService getKeepAliveService() {
			return this.keepAliveService;
		}

		@Override
		public String toJson() {
			// TODO format json of AckServerOpeningAvaiability!
			if (isOpeningAvaiable()) {
				return "";
			} else {
				return "";
			}
		}
		
	}

	
	protected class AckServerOpened {
		
	}
	
	
	protected class AckError {
		
	}

}
