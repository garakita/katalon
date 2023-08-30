import katalon from "@katalon-studio/cloud-test";

export default katalon.testCase("New Test Case", async ({ local, web }) => {
  await new Promise((r) => setTimeout(r, 0));
  await web.openBrowser("https://katalon-demo-cura.herokuapp.com");
  await web.click({
    type: "Web",
    id: "dc3646e8-6489-422e-923d-96402cfad908",
    attributes: {
      id: "menu-toggle",
      href: "#",
      class: "btn btn-dark btn-lg toggle",
    },
    childIndex: 1,
    hashes: { "md5.v1": "bd1a4d233fee02bdbcf85af89867c9de" },
    name: "a - btn btn-dark btn-lg toggle",
    selectors: [
      {
        id: "ad4e28c8-42be-411d-bcfe-93df5d581638",
        type: "CSS",
        value: "#menu-toggle",
        isDefault: true,
      },
      {
        id: "ec58d792-b9c1-4d19-aef4-6564ae1176a4",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "a",
    text: "",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "48a3eb09-b6cb-48ac-86be-0af122df95bc",
    attributes: {
      href: "profile.php#login",
      onclick: "$('#menu-close').click();",
    },
    childIndex: 1,
    hashes: { "md5.v1": "0bd0cc05e00accd5b4b22670791231d9" },
    name: "a - Login",
    selectors: [
      {
        id: "05c427c5-7eb5-4472-a923-4aa041ab4e92",
        type: "CSS",
        value: '[href="profile\\.php\\#login"]',
        isDefault: true,
      },
      {
        id: "6f15cb49-dbb8-4492-8109-9a116e97b518",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "a",
    text: "Login",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "61ddca79-72bb-4710-8636-4e513febdbca",
    attributes: { id: "btn-login", type: "submit", class: "btn btn-default" },
    childIndex: 1,
    hashes: { "md5.v1": "50aa64147a00037c420def1e18673ac9" },
    name: "button - Login",
    selectors: [
      {
        id: "8359dd91-934b-47c4-95f3-249f49fa4329",
        type: "CSS",
        value: "#btn-login",
        isDefault: true,
      },
      {
        id: "1123679a-54eb-4280-8814-380a66b94f5f",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "button",
    text: "Login",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.doubleClick({
    type: "Web",
    id: "61ddca79-72bb-4710-8636-4e513febdbca",
    attributes: { id: "btn-login", type: "submit", class: "btn btn-default" },
    childIndex: 1,
    hashes: { "md5.v1": "50aa64147a00037c420def1e18673ac9" },
    name: "button - Login",
    selectors: [
      {
        id: "8359dd91-934b-47c4-95f3-249f49fa4329",
        type: "CSS",
        value: "#btn-login",
        isDefault: true,
      },
      {
        id: "1123679a-54eb-4280-8814-380a66b94f5f",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "button",
    text: "Login",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "8c12f416-3f6c-4a26-b499-a6620a086131",
    attributes: {
      type: "password",
      class: "form-control",
      id: "txt-password",
      name: "password",
      placeholder: "Password",
      value: "",
      autocomplete: "off",
    },
    childIndex: 1,
    hashes: { "md5.v1": "fe634c654141065106a978262a410740" },
    name: "input - Password",
    selectors: [
      {
        id: "343685f0-1be8-4437-8874-7b8e3ae69602",
        type: "CSS",
        value: "#txt-password",
        isDefault: true,
      },
      {
        id: "b67a797b-dc38-4483-8c3f-7fffe1b1b1f6",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "input",
    text: "",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.closeBrowser();
});