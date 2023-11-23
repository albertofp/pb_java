package br.edu.infnet.jobhunter.model.domain;

public class SavedJob extends Job{
        public Progress getProgress() {
                return progress;
        }

        public void setProgress(Progress progress) {
                this.progress = progress;
        }

        Progress progress;
}
