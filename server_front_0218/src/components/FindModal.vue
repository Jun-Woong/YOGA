<template>
  <div id="find2">
    <div id="finduseridbox">
      <div id="finduserid">
        <div id="h2div" class="pb-0 col-12">
          <h2>아이디 찾기</h2>
        </div>
        <div>
          <b-form-group>
            <b-input-group class="mb-2 inputBlock">
              <b-input-group-prepend is-text>
                <b-icon icon="key"></b-icon>
              </b-input-group-prepend>
              <b-form-input
                v-model="user.email"
                type="email"
                placeholder="가입시 사용한 이메일을 입력해주세요"
              ></b-form-input>
            </b-input-group>
          </b-form-group>
        </div>
        <div>
          <b-form-group label-for="input-lazy">
            <b-button @click="finduserid" variant="danger" class="col-12"
              >찾기</b-button
            >
          </b-form-group>
        </div>
      </div>
    </div>
    <div id="findpwbox">
      <div id="findpw">
        <div id="h2div" class="pb-0 col-12">
          <h2>비밀번호 찾기</h2>
        </div>
        <div>
          <b-form-group>
            <b-input-group class="mb-2 inputBlock">
              <b-input-group-prepend is-text>
                <b-icon icon="person-fill"></b-icon>
              </b-input-group-prepend>
              <b-form-input
                v-model="user.userid"
                type="text"
                placeholder="가입시 사용한 아이디를 입력해주세요"
              ></b-form-input>
            </b-input-group>
          </b-form-group>

          <b-form-group>
            <b-input-group class="mb-2 inputBlock">
              <b-input-group-prepend is-text>
                <b-icon icon="key"></b-icon>
              </b-input-group-prepend>
              <b-form-input
                v-model="user.email"
                type="email"
                placeholder="가입시 사용한 이메일을 입력해주세요"
              ></b-form-input>
            </b-input-group>
          </b-form-group>
        </div>
        <div>
          <b-form-group label-for="input-lazy">
            <b-button @click="findpw" variant="danger" class="col-12"
              >찾기</b-button
            >
          </b-form-group>
        </div>
        <div class="pt-0">
          <p id="goLogin" @click="$bvModal.hide('modal-2')">로그인 하러가기</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "find",
  data: function () {
    return {
      user: {
        userid: "",
        email: "",
      },
      message: "",
    };
  },

  methods: {
    finduserid: function () {
      this.$store
        .dispatch("FINDUSERID", this.user)
        .then()
        .catch(({ message }) => (this.msg = message));
    },
    findpw: function () {
      this.$store
        .dispatch("FINDPW", this.user)
        .then()
        .catch(({ message }) => (this.msg = message));
    },
  },
};
</script>

<style scoped>
#find {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}
#finduseridbox {
  max-width: 100%;
}

h2 {
  padding: 2rem;
}
#goLogin {
  text-align: center;
}

#h2div {
  text-align: center;
}
#goLogin:hover {
  cursor: pointer;
  color: #c82333;
}
</style>